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
        int numberToReturn = 0;
        String textGotFromWindow = "";
        boolean isValueParsed = false;
        while (!isValueParsed && textGotFromWindow != null) {
            textGotFromWindow = JOptionPane.showInputDialog(windowText);
            if (textGotFromWindow == null) {
                return null;
            }
            try {
                numberToReturn = Integer.parseInt(textGotFromWindow);
                isValueParsed = true;
            } catch (NumberFormatException ex) {
                if (textGotFromWindow != null) {
                    WindowUtils.showText("Wprowadzony tekst nie jest liczbą lub cos innego poszlo nie tak :( Spróbuj ponownie z inna liczba ");
                }
            }
        }
        return numberToReturn;
    }
}
