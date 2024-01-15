package be.vdab.jpfhfdst6;

public class Arrayvan5int {
    public static void main(String[] args) {
        var ints = new int[5];
        ints[0] = (int)((Math.random() * 100) + 1);
        ints[1] = (int)((Math.random() * 100) + 1);
        ints[2] = (int)((Math.random() * 100) + 1);
        ints[3] = (int)((Math.random() * 100) + 1);
        ints[4] = (int)((Math.random() * 100) + 1);
        var som = 0;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
            som += ints[i];
        }
        System.out.println("Som van de getallen: " + som);
        System.out.println("Gemiddelde: " + som/(float)ints.length);
    }
}
