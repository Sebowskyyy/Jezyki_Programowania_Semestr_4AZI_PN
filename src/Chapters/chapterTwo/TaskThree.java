package Chapters.chapterTwo;

public class TaskThree {
    public abstract static class Wielomian{
       public abstract void wypiszMiejscaZerowe();
       }

    public static class FunkcjaLiniowa extends Wielomian {
        private double a, b;

        public FunkcjaLiniowa(double a, double b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void wypiszMiejscaZerowe() {
            if (a == 0) {
                System.out.println("brak");
            } else {
                double x = -b / a;
                System.out.println(x);
            }
        }
    }
    public static class FunkcjaKwadratowa extends Wielomian {
        private double a, b, c;

        public FunkcjaKwadratowa(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        public void wypiszMiejscaZerowe() {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("brak");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b - sqrtDelta) / (2 * a);
                double x2 = (-b + sqrtDelta) / (2 * a);
                System.out.println(x1 + " " + x2);
            }
        }
    }
    }

