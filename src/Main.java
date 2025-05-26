import java.io.File;

import Chapters.chapterOne.C1AllTasks;
import Chapters.chapterThree.Kolejka;
import Chapters.chapterTwo.C2TaskOne;
import Chapters.chapterTwo.C2TaskThree;
import Chapters.chapterTwo.C2TaskTwo;
import Chapters.chatperFour.C4T2;
import Utils.WindowUtils;

public class Main {

    public static void main(String[] args) {
/*                C1AllTasks.returnUpperText().ifPresent(WindowUtils::showText);                            // Zad 1.1
                C1AllTasks.factorial().ifPresent(WindowUtils::showText);                                  // Zad 1.2
                C1AllTasks.sumOddNumbers().ifPresent(WindowUtils::showText);                              // Zad 1.3
                C1AllTasks.binaryRepresentation().ifPresent(WindowUtils::showText);                       // Zad 1.4
                C1AllTasks.octalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);          // zad 1.4
                C1AllTasks.hexaDecimalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);    // zad 1.4

        C2TaskOne.Rational firstRational = new C2TaskOne.Rational(5, 6);
        C2TaskOne.Rational secondRational = new C2TaskOne.Rational(2, 10);
        C2TaskOne.Rational thirdRational = new C2TaskOne.Rational(15, 18);
        C2TaskOne.Rational fourthRational = new C2TaskOne.Rational(3, 18);
        firstRational.add(secondRational);
        firstRational.subtract(secondRational);
        firstRational.multiply(secondRational);
        firstRational.divide(secondRational);
        System.out.println(firstRational.isEqual(secondRational));
        System.out.println(firstRational.isEqual(thirdRational));
        System.out.println(firstRational.compareTo(secondRational));
        System.out.println(firstRational.compareTo(thirdRational));
        System.out.println(firstRational.compareTo(fourthRational));
        System.out.println(firstRational.toString());

        C2TaskTwo.QuadraticEquation quadraticEquation = new C2TaskTwo.QuadraticEquation(1,4,1);
        System.out.println(quadraticEquation.numberOfXs());
        System.out.println(quadraticEquation.findY(3));

        C2TaskThree.Wielomian w[] = new C2TaskThree.Wielomian[3];
        w[0] = new C2TaskThree.FunkcjaLiniowa(2, 1);
        w[1] = new C2TaskThree.FunkcjaKwadratowa(1, -2, 2);
        w[2] = new C2TaskThree.FunkcjaKwadratowa(1, 0, -1);
        for (int i=0; i<3; i++) {
            w[i].wypiszMiejscaZerowe();
        }*/
   /*     Kolejka k = new Kolejka();
        try {
            k.doKolejki(Integer.valueOf(7));
            k.doKolejki(new String("Ala ma kota"));
            k.doKolejki(Double.valueOf(3.14));
            k.doKolejki(5);
            k.doKolejki(5);
            k.doKolejki(5);
            for (int i = 1; i <= 6; ++i)
                System.out.println((k.zKolejki()).toString());
        } catch (Kolejka.BladPrzezNadmiar exception) {
            System.out.println("Nastąpił błąd przepełnienia kolejki");
        } catch (Kolejka.BladPrzezNiedomiar exception) {
            System.out.println("Bład niedopełnienia kolejki");
        }*/
        C4T2.makeFile("doZzipowania");
        C4T2.zip("doZzipowania","poZipie");
        C4T2.unZip("poZipie.gz","poUnzipie");
    }
}