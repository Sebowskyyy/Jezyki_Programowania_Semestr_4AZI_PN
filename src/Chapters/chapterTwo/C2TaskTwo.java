package Chapters.chapterTwo;

public class C2TaskTwo {
    public static class QuadraticEquation {
        public QuadraticEquation(int a, int b, int c){
            setA(a);
            setB(b);
            setC(c);
        }
        public int findY(int x) {
            return (x * x  * this.a) + (x * this.b) + this.c;
        }

        public int numberOfXs() {
            int temp;
            int numberToReturn;
            temp = this.b * this.b - 4 * a * c;

            if (temp > 0) {
                numberToReturn = 2;
            } else if (temp == 0) {
                numberToReturn = 1;
            } else {
                numberToReturn = 0;
            }
            return numberToReturn;
        }

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }

        public void setC(int c) {
            this.c = c;
        }


        private int x;
        private int a;
        private int b;
        private int c;
    }
}
