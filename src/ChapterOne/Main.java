package ChapterOne;

import java.math.BigInteger;
import java.util.Optional;

import Utils.WindowUtils;

public class Main {


    public static Optional<String> binaryRepresentation() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe a zamienie na system dwójkowy"))
                .map(Main::binaryRepresentationCalc);
    }

    public static String binaryRepresentationCalc(Integer numberToConvert) {
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

    public static Optional<String> octalRepresentationOfDecimalValue() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe a zamienie na system ósemkowy"))
                .map(Main::octalRepresentationOfDecimalValueCalc);
    }

    public static String octalRepresentationOfDecimalValueCalc(Integer decimalValue) {
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
            }
        }
        return octalRepresentationInString;
    }

    public static Optional<String> hexaDecimalRepresentationOfDecimalValue() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe a zamienie na system szesnastkowy"))
                .map(Main::hexaDecimalRepresentationOfDecimalValueCalc);
    }

    public static String hexaDecimalRepresentationOfDecimalValueCalc(Integer decimalValue) {
        String hexaValueAsString;
        hexaValueAsString = decimalValue % 16 + ",";
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


    public static Optional<BigInteger> factorial() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe do silni"))
                .map(Main::factorialCalc);
    }

    private static BigInteger factorialCalc(Integer numberProvidedByUser) {
        BigInteger numberToReturn = BigInteger.ONE;
        BigInteger numberForFactorial = BigInteger.valueOf(numberProvidedByUser);
        while (numberForFactorial.signum() == 1) {
            numberToReturn = numberToReturn.multiply(numberForFactorial);
            numberForFactorial = numberForFactorial.subtract(BigInteger.ONE);
        }
        return numberToReturn;
    }


    public static Optional<Integer> sumOddNumbers() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbę a ja zsumuje wszelkie wynikające z niej mniejsze nieparzyste liczby"))
                .map(Main::sumOddNumbersCalc);
    }

    public static Integer sumOddNumbersCalc(Integer endingNumber) {
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
// todo przerobić zad1
    public static void main(String[] args) {
//        String textIWantToUpper = getTextWithWindow("Wprowadź litery a zwrócę je z CAPSEM");
//        if (textIWantToUpper != null) {// zad 1.1
//            showText(textIWantToUpper.toUpperCase());
//        } //Zad 1.1
        factorial().ifPresent(WindowUtils::showText);//Zad 1.2
        sumOddNumbers().ifPresent(WindowUtils::showText); // zad 1.3
//
        binaryRepresentation().ifPresent(WindowUtils::showText); //zad 1.4
        octalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText); // zad 1.4
        hexaDecimalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText); // zad 1.4

    }


}