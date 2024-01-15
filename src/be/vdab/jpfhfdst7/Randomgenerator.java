package be.vdab.jpfhfdst7;

public class Randomgenerator {
    public static void main(String[] args) {

        var getallen = new int[100];

        for (int i = 0; i < 10000; i++) {
            var randomGetal = (int)((Math.random() * 100) + 1);
            getallen[randomGetal-1]++;
        }
        for (int i = 0; i < getallen.length; i++) {
            System.out.println("Getal " + (i+1) + ": " + getallen[i] + " keer");
        }
    }
}
