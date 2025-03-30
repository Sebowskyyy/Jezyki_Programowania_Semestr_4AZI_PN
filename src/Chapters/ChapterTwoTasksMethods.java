package Chapters;

public class ChapterTwoTasksMethods {

    public static class Rational {
        public Rational(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            System.out.println("This rational number is " + this.numerator + "/" + this.denominator);
        }

        // todo zabezpieczyć przed 0 w denominatorze
        public Rational add(Rational addedRational) {
            return new Rational(this.numerator * addedRational.denominator + this.denominator * addedRational.numerator,
                    this.denominator * addedRational.denominator);
            //---------------How It Works------------
            //      a/b + c/d = a*d + c*b / b*d ----- Multiply numerators with other number denominators, so u get proper numerators for denominators :D
            // Then multiply denominators to get common denominator  i read this and its still not simple, but i dont wanna spend hour on 1 task, sorry :(

        }

        public Rational multiply(Rational multiplier) {
            return new Rational(this.numerator * multiplier.numerator, this.denominator * multiplier.denominator);
        }

        public Rational subtract(Rational subtrahend) {
            return new Rational(this.numerator * subtrahend.denominator - this.denominator * subtrahend.denominator,
                    this.denominator * subtrahend.denominator);
        }

        public Rational divide(Rational divider) {
            return new Rational(this.numerator * divider.denominator, this.denominator * divider.denominator);
        }

        public void simplify() {
            int divider = this.denominator;

            if (this.numerator == this.denominator) {
                this.numerator = 1;
                this.denominator = 1;
            } else if (this.numerator > this.denominator) {
                int StashNumber = this.numerator / this.denominator;
                this.numerator = this.numerator % this.denominator;

                while (divider > 1 && this.numerator > 0) {
                    if (this.numerator % divider == 0 && this.denominator % divider == 0) {
                        this.numerator = this.numerator / divider;
                        this.denominator = this.denominator / divider;
                    }
                    divider--;

                }
                if (this.numerator == 0){
                    this.denominator = 1;
                }
                this.numerator = this.numerator + this.denominator * StashNumber;

            } else if (this.numerator < this.denominator) {
                while (divider > 1) {
                    if (this.numerator % divider == 0 && this.denominator % divider == 0) {
                        this.numerator = this.numerator / divider;
                        this.denominator = this.denominator / divider;
                    }
                    divider--;
                }
            }

        }

        public String toString() {

            return this.numerator + "/" + this.denominator;
        }

        Boolean Equals(Rational numToCompare) {
            return false;
        }

        private int numerator;
        private int denominator;

    }
}
