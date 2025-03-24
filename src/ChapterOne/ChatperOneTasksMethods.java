package ChapterOne;

import Utils.WindowUtils;

import java.math.BigInteger;
import java.util.Optional;

public class ChatperOneTasksMethods {


    public static Optional<String> returnUpperText() {
        return Optional.ofNullable(WindowUtils.getTextWithWindow("Wpisz tekst, a ja zamienie litery na wielkie"))
                .map(ChatperOneTasksMethods::returnUpperTextPrep);
    }

    public static String returnUpperTextPrep(String textToUpper) {
        return textToUpper.toUpperCase();
    }

    public static Optional<String> binaryRepresentation() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe a zamienie na system dwójkowy"))
                .map(ChatperOneTasksMethods::binaryRepresentationCalc);
    }

    public static String binaryRepresentationCalc(Integer numberToConvert) {
        StringBuilder binaryRepresentationOfInt = new StringBuilder();
        while (numberToConvert != 1 && numberToConvert != 0) {
            if (numberToConvert % 2 == 1) {
                binaryRepresentationOfInt.insert(0, "1");
            } else if (numberToConvert % 2 == 0) {
                binaryRepresentationOfInt.insert(0, "0");
            }

            numberToConvert = numberToConvert / 2;

        }
        if (numberToConvert == 1) {
            binaryRepresentationOfInt.insert(0, "1");
        }
        System.out.println(binaryRepresentationOfInt);
        return binaryRepresentationOfInt.toString();
    }

    public static Optional<String> octalRepresentationOfDecimalValue() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe a zamienie na system ósemkowy"))
                .map(ChatperOneTasksMethods::octalRepresentationOfDecimalValueCalc);
    }

    public static String octalRepresentationOfDecimalValueCalc(Integer decimalValue) {
        String octalRepresentationInString;
        octalRepresentationInString = String.valueOf(decimalValue % 8);
        decimalValue = decimalValue - decimalValue % 8;


        StringBuilder octalRepresentationInStringBuilder = new StringBuilder(octalRepresentationInString);
        while (decimalValue != 0) {
            decimalValue = decimalValue / 8;
            if (decimalValue % 8 != 0) {
                octalRepresentationInStringBuilder.insert(0, (decimalValue % 8));
                if (decimalValue - decimalValue % 8 > 0)
                    decimalValue = decimalValue - (decimalValue % 8); // odjecie
            } else if (decimalValue != 0 && decimalValue % 8 == 0) {
                octalRepresentationInStringBuilder.insert(0, "0");
            }
        }
        octalRepresentationInString = octalRepresentationInStringBuilder.toString();
        return octalRepresentationInString;
    }

    public static Optional<String> hexaDecimalRepresentationOfDecimalValue() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe a zamienie na system szesnastkowy"))
                .map(ChatperOneTasksMethods::hexaDecimalRepresentationOfDecimalValueCalc);
    }

    public static String hexaDecimalRepresentationOfDecimalValueCalc(Integer decimalValue) {
        StringBuilder hexaValueAsString;
        hexaValueAsString = new StringBuilder(decimalValue % 16 + ",");
        decimalValue = decimalValue - decimalValue % 16;

        while (decimalValue != 0) {
            decimalValue = decimalValue / 16;
            if (decimalValue % 16 != 0) {
                hexaValueAsString.insert(0, (decimalValue % 16) + ",");
                if (decimalValue - decimalValue % 16 > 0)
                    decimalValue = decimalValue - (decimalValue % 16);
            } else if (decimalValue != 0 && decimalValue % 16 == 0) {
                hexaValueAsString.insert(0, "0");
            }


        }
        String[] hexCharacters = {"A", "B", "C", "D", "E", "F"};
        for (int i = 10; i < 16; i++) {
            hexaValueAsString = new StringBuilder(hexaValueAsString.toString().replaceAll(i + ",", hexCharacters[i - 10]));
        }
        hexaValueAsString = new StringBuilder(hexaValueAsString.toString().replaceAll(",", ""));
        return hexaValueAsString.toString();
    }


    public static Optional<BigInteger> factorial() {
        return Optional.ofNullable(WindowUtils.getIntWithWindow("Podaj liczbe do silni"))
                .map(ChatperOneTasksMethods::factorialCalc);
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
                .map(ChatperOneTasksMethods::sumOddNumbersCalc);
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
}
