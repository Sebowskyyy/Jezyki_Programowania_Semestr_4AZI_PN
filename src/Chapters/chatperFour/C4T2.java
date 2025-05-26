package Chapters.chatperFour;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.io.File;
import java.io.FileWriter;

public class C4T2 {
    private static final String tempDir = System.getProperty("java.io.tmpdir") + "asd\\" ;

    public static File makeFile(String fileName) {
        System.out.println(tempDir  + fileName);
        File file = new File(tempDir + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("Plik został utworzony: " + file.getAbsolutePath());

                // Zapis tekstu do pliku
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("To jest zawartość pliku.\nMożesz ją dowolnie zmienić.");
                    System.out.println("Zapisano zawartość do pliku.");
                }
            } else {
                System.out.println("Plik już istnieje: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd:");
            e.printStackTrace();
        }
        return file;
    }

    public static void zip(String currentName, String zippedName) {
        final String sourceFile = tempDir   + currentName;
        final String gzipFile = tempDir  + zippedName + ".gz";
        System.out.println(sourceFile);
        System.out.println(gzipFile);

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
                FileOutputStream outputStream = new FileOutputStream(gzipFile);
                GZIPOutputStream zipStream = new GZIPOutputStream(outputStream)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) > 0) {
                zipStream.write(buffer, 0, len); // ważne: 0 jako offset, length jako długość
            }
            System.out.println("Plik został skompresowany do: " + gzipFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void unZip(String currentName, String unZippedName) {
        final String sourceFile = tempDir  + currentName;        // plik wejściowy
        final String unZippedFile = tempDir  + unZippedName;           // wynikowy plik po dekompresji
        System.out.println(sourceFile);
        System.out.println(unZippedFile);

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
                GZIPInputStream zipStream = new GZIPInputStream(inputStream);
                FileOutputStream outputStream = new FileOutputStream(unZippedFile)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = zipStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            System.out.println("Plik został zdekompresowany do: " + unZippedName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


