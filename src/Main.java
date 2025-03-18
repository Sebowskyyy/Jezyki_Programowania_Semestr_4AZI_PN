import javax.swing.JOptionPane;
import java.math.BigInteger;


public class Main {
    public static int getIntWithWindow(String windowText) {
        int numberToReturn = 0;
        String textGotFromWindow = "";
        boolean isValueParsed = false;
        while (!isValueParsed && textGotFromWindow != null) {
            textGotFromWindow = JOptionPane.showInputDialog(windowText);
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
        JOptionPane.showMessageDialog(null, textToShowInWindow);
    }

    public static String binaryRepresentation() {
        int numberToConvert = getIntWithWindow("Podaj liczbe a zamienie na bity");
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

    public static String octalRepresentation() {
        int numberToConvert = getIntWithWindow("Podaj liczbe a zamienie na osemkowy");
        int octalRepresentHelper = 0;
        String octalRepresentationOfInt = "";


        octalRepresentHelper = numberToConvert % 8;
        octalRepresentationOfInt = octalRepresentationOfInt + octalRepresentHelper;
        numberToConvert = numberToConvert - octalRepresentHelper;
        int counter = 0;
        int firstNumber;
//        while (numberToConvert > 1) {
//            counter++;
//            numberToConvert = numberToConvert / 8;
//            firstNumber = octalRepresentationOfInt.charAt(1);
//            if (counter == 8)
//                counter = counter / 8;
//                firstNumber = firstNumber + counter;
//
//        }


        System.out.println(octalRepresentationOfInt);




        return octalRepresentationOfInt;
    }


    public static BigInteger factorial() {
        int numberForFactrial;
        BigInteger numberToReturn = new BigInteger("1");
        numberForFactrial = getIntWithWindow("Podaj liczbe do silni");
        while (numberForFactrial > 0) {
            numberToReturn = numberToReturn.multiply(BigInteger.valueOf(numberForFactrial));
            numberForFactrial--;
            System.out.println(numberToReturn);
        }


        return numberToReturn;
    }


    public static int sumOddNumbers(int endingNumber) {
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
        //    String textIWantToUpper = getTextWithWindow("Wprowadź litery a zwrócę je z CAPSEM");
        //    showText(textIWantToUpper.toUpperCase()); //Zad 1.1
        //    System.out.println(factorial().toString());
       /* showText(String.valueOf(factorial()));//Zad 1.2
        int sumOfOdds = sumOddNumbers(Integer.parseInt(getTextWithWindow("Wprowadz liczbe konczaca zakres"))); //zad 1.3
        showText(String.valueOf(sumOfOdds)); // zad 1.3
*/
        binaryRepresentation();
        //       octalRepresentation();


        String lama = "000111010";
        String newLama = lama.substring(3);

        System.out.println(newLama);
    }


}