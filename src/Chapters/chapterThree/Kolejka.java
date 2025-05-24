package Chapters.chapterThree;

public class Kolejka {
        static final int N = 5;
        private Object[] tab;
        private int pocz, zaost, lbel;

        public Kolejka() {
            pocz=0; zaost=0; lbel=0;
            tab = new Object[N];
        }
    public static class BladPrzezNiedomiar extends Exception{
    }
    public static class BladPrzezNadmiar extends Exception{
    }

        public void doKolejki(Object el) throws BladPrzezNadmiar,BladPrzezNiedomiar {
            tab[zaost] = el;
            zaost = (zaost+1) % N;
            ++lbel;
            if (lbel > N) {
                throw new BladPrzezNadmiar();
            }
        }

        public Object zKolejki() throws BladPrzezNiedomiar {
            int ind = pocz;
            pocz = (pocz+1) % N;
            --lbel;
            if (lbel < 1) {
                throw new BladPrzezNiedomiar();
            }
            return tab[ind];
        }
}
