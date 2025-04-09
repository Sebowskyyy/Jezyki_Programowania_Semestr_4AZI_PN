import Chapters.chapterTwo.TaskOne;
import Chapters.chapterTwo.TaskThree;
import Chapters.chapterTwo.TaskTwo;

public class Main {

    public static void main(String[] args) {
        //        ChatperOneTasksMethods.returnUpperText().ifPresent(WindowUtils::showText);                            // Zad 1.1
        //        ChatperOneTasksMethods.factorial().ifPresent(WindowUtils::showText);                                  // Zad 1.2
        //        ChatperOneTasksMethods.sumOddNumbers().ifPresent(WindowUtils::showText);                              // Zad 1.3
        //        ChatperOneTasksMethods.binaryRepresentation().ifPresent(WindowUtils::showText);                       // Zad 1.4
        //        ChatperOneTasksMethods.octalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);          // zad 1.4
        //        ChatperOneTasksMethods.hexaDecimalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);    // zad 1.4

        TaskOne.Rational firstRational = new TaskOne.Rational(5, 6);
        TaskOne.Rational secondRational = new TaskOne.Rational(2, 10);
        TaskOne.Rational thirdRational = new TaskOne.Rational(15, 18);
        TaskOne.Rational fourthRational = new TaskOne.Rational(3, 18);
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

        TaskTwo.QuadraticEquation quadraticEquation = new TaskTwo.QuadraticEquation(1,4,1);
        System.out.println(quadraticEquation.numberOfXs());
        System.out.println(quadraticEquation.findY(3));

        TaskThree.Wielomian w[] = new TaskThree.Wielomian[3];
        w[0] = new TaskThree.FunkcjaLiniowa(2, 1);
        w[1] = new TaskThree.FunkcjaKwadratowa(1, -2, 2);
        w[2] = new TaskThree.FunkcjaKwadratowa(1, 0, -1);
        for (int i=0; i<3; i++) {
            w[i].wypiszMiejscaZerowe();
        }


    }
}