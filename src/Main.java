import javax.swing.JOptionPane;
import java.math.BigInteger;


public class Main {
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
                    showText("Wprowadzony tekst nie jest liczbą lub cos innego poszlo nie tak :( Spróbuj ponownie z inna liczba ");
                }
            }
        }
        return numberToReturn;
    }

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

    public static String binaryRepresentation() {
        Integer numberToConvert = getIntWithWindow("Podaj liczbe a zamienie na system dwójkowy");
        if (numberToConvert == null) {
            return null;
        }
        String binaryRepresentationOfInt = "";
        while (numberToConvert != 1 && numberToConvert != 0) {
            if (numberToConvert % 2 == 1) {
                binaryRepresentationOfInt = "1" + binaryRepresentationOfInt;
            } else if (numberToConvert % 2 == 0) {
                binaryRepresentationOfInt = "0" + binaryRepresentationOfInt;
            }

            numberToConvert = numberToConvert / 2;

        }
        if (numberToConvert == 1) {
            binaryRepresentationOfInt = "1" + binaryRepresentationOfInt;
        }
        System.out.println(binaryRepresentationOfInt);
        return binaryRepresentationOfInt;
    }

    public static String octalRepresentationOfDecimalValue() {
        Integer decimalValue = getIntWithWindow("Podaj liczbe a zamienie na system ósemkowy");
        if(decimalValue == null){
            return null;
        }
        String octalRepresentationInString = "";
        octalRepresentationInString = String.valueOf(decimalValue % 8);
        decimalValue = decimalValue - decimalValue % 8;


        while (decimalValue != 0) {
            decimalValue = decimalValue / 8;
            if (decimalValue % 8 != 0) {
                octalRepresentationInString = String.valueOf(decimalValue % 8) + octalRepresentationInString;
                if (decimalValue - decimalValue % 8 > 0)
                    decimalValue = decimalValue - (decimalValue % 8); // odjecie
            } else if (decimalValue != 0 && decimalValue % 8 == 0) {
                octalRepresentationInString = "0" + octalRepresentationInString;
            } else if (decimalValue == 1) {
                octalRepresentationInString = "1" + octalRepresentationInString;
            }


        }
        return octalRepresentationInString;
    }

    /// Patrząc na to co wygenerowało AI niżej, chyba lekko przekombinowałem :D, ale przynajmniej to u góry to mój naturalny skrypt
    /// a nie to co dzisiaj, wszystko sztuczne, hodowane przez AI

/*
    int liczbaDziesietnaAI = 95648;
    String sklejkaAI = "";

        while (liczbaDziesietnaAI > 0) {
        sklejkaAI = (liczbaDziesietnaAI % 8) + sklejkaAI;
        liczbaDziesietnaAI /= 8;
    }

        System.out.println(sklejkaAI);

*/
    public static String hexaDecimalRepresentationOfDecimalValue() {
        String hexaValueAsString = "";
        Integer decimalValue = getIntWithWindow("Podaj liczbe a zamienie na system szesnastkowy");
        if(decimalValue == null){
            return null;
        }
        hexaValueAsString =  String.valueOf(decimalValue % 16) + ",";
        decimalValue = decimalValue - decimalValue % 16;


        while (decimalValue != 0) {
            decimalValue = decimalValue / 16;
            if (decimalValue % 16 != 0) {
                hexaValueAsString = String.valueOf(decimalValue % 16) + "," + hexaValueAsString;
                if (decimalValue - decimalValue % 16 > 0)
                    decimalValue = decimalValue - (decimalValue % 16);
            } else if (decimalValue != 0 && decimalValue % 16 == 0) {
                hexaValueAsString = "0" + hexaValueAsString;
            }


        }
        String[] hexCharacters = {"A", "B", "C", "D", "E", "F"};
        for (int i = 10; i < 16; i++) {
            hexaValueAsString = hexaValueAsString.replaceAll(i + ",", hexCharacters[i - 10]);
        }
        hexaValueAsString = hexaValueAsString.replaceAll(",", "");
        return hexaValueAsString;
    }


    public static BigInteger factorial() {
        BigInteger numberToReturn = new BigInteger("1");
        Integer numberForFactrial = getIntWithWindow("Podaj liczbe do silni");
        if (numberForFactrial == null) {
            return null;
        }
        while (numberForFactrial > 0) {
            numberToReturn = numberToReturn.multiply(BigInteger.valueOf(numberForFactrial));
            numberForFactrial--;
        }


        return numberToReturn;
    }


    public static Integer sumOddNumbers() {
        Integer endingNumber = getIntWithWindow("Podaj liczbę a ja zsumuje wszelkie wynikające z niej mniejsze nieparzyste liczby");
        if (endingNumber == null) {
            return null;
        }
        int sum = 0;
        while (endingNumber > 0) {
            if (endingNumber % 2 == 1) {
                sum = endingNumber + sum;
            }
            endingNumber--;
        }

        return sum;
    }


    public static void main(String[] args) {
        String textIWantToUpper = getTextWithWindow("Wprowadź litery a zwrócę je z CAPSEM");
        if (textIWantToUpper != null) {// zad 1.1
            showText(textIWantToUpper.toUpperCase());
        } //Zad 1.1
        showText(factorial());//Zad 1.2
        showText(sumOddNumbers()); // zad 1.3

        showText(binaryRepresentation()); //zad 1.4
        showText(octalRepresentationOfDecimalValue()); // zad 1.4
        showText(hexaDecimalRepresentationOfDecimalValue()); // zad 1.4

    }


}