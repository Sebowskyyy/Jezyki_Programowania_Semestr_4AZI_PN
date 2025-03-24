package ChapterOne;

import Utils.WindowUtils;

public class Main {

    public static void main(String[] args) {
        TasksMethods.returnUpperText().ifPresent(WindowUtils::showText);                            // Zad 1.1
        TasksMethods.factorial().ifPresent(WindowUtils::showText);                                  // Zad 1.2
        TasksMethods.sumOddNumbers().ifPresent(WindowUtils::showText);                              // Zad 1.3
        TasksMethods.binaryRepresentation().ifPresent(WindowUtils::showText);                       // Zad 1.4
        TasksMethods.octalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);          // zad 1.4
        TasksMethods.hexaDecimalRepresentationOfDecimalValue().ifPresent(WindowUtils::showText);    // zad 1.4
    }
}