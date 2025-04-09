package Utils;

import javax.swing.*;
import java.math.BigInteger;

public class WindowUtils {

    public static String getTextWithWindow(String windowText) {
        return JOptionPane.showInputDialog(windowText, null);
    }

    public static void showText(String textToShowInWindow) {
        if (textToShowInWindow != null) {
            JOptionPane.showMessageDialog(null, textToShowInWindow);
        }
    }

    public static void showText(BigInteger textToShowInWindow) {
        if (textToShowInWindow != null) {
            JOptionPane.showMessageDialog(null, textToShowInWindow);
        }
    }

    public static void showText(Integer textToShowInWindow) {
        if (textToShowInWindow != null) {
            JOptionPane.showMessageDialog(null, textToShowInWindow);
        }
    }

    public static Integer getIntWithWindow(String windowText) {
        Integer result = null;
        while (result == null) {
            String input = JOptionPane.showInputDialog(windowText);
            try {
                if (input != null) {
                    result = Integer.parseInt(input);
                } else {
                    break;
                }
            } catch (NumberFormatException ex) {
                WindowUtils.showText("Wprowadzony tekst nie jest liczbą. Spróbuj ponownie.");
            }
        }
        return result;
    }


    public static int getInt(){
        String input = JOptionPane.showInputDialog("Podaj liczbę całkowitą:");
        int number = Integer.parseInt(input);
        try {

            JOptionPane.showMessageDialog(null, "Wpisałeś liczbę: " + number);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "To nie jest poprawna liczba całkowita!", "Błąd", JOptionPane.ERROR_MESSAGE);
        }
        return number;
    }
}
