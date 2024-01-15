package be.vdab.jpfhfdst7;


    public class Arrayvan5int {
        public static void main(String[] args) {
            var ints = new int[5];
            var som = 0;
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int)((Math.random() * 100) + 1);
                som += ints[i];
            }

            for (int getal : ints) {
                System.out.println(getal);
            }

            System.out.println("Som van de getallen: " + som);
            System.out.println("Gemiddelde: " + som/(float)ints.length);
        }
    }
