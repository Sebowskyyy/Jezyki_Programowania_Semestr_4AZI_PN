package Utils;

public class Menu {
    final String mainMenuText = "Dzień dobry :) co mogę dla Ciebie zrobić?"
            + "\n 1. Wybierz zadanie z rozdziału 1"
            + "\n 2. Wybierz zadanie z rozdziału 2"
            + "\n 3. Wybierz zadanie z rozdziału 3";
    final String chapterOneMenuText = "Wybierz zadanie z rozdziału pierwszego :)"
            + "\n 1. Zwróć UPPER text"
            + "\n 2. Policz silnię"
            + "\n 3. Zsumuj nieparzyste liczby mniejsze od podanej"
            + "\n 4. Przedstaw w postaci binarnej"
            + "\n 5. Przedstaw w postaci ósemkowej"
            + "\n 6. Przedstaw w postaci szesnastkowej";
    final String chapterTwoMenuText = "Wybierz zadanie z rozdziału pierwszego :)"
            + "\n 1. Zwróć UPPER text"
            + "\n 2. Policz silnię"
            + "\n 3. Zsumuj nieparzyste liczby mniejsze od podanej"
            + "\n 4. Przedstaw w postaci binarnej"
            + "\n 5. Przedstaw w postaci ósemkowej"
            + "\n 6. Przedstaw w postaci szesnastkowej";
    private Integer choice(String menuText) {
        return WindowUtils.getIntWithWindow(menuText);
    }

}



