package be.vdab.jpfhfdst5;

public class Snoepautomaat {
    public static void main(String[] args) {
        var ingave = 2;
        var kost = 1.02;
        var terug = ingave * 100 - (int)(kost * 100);

        var munt100 = terug / 100;
        var rest = terug % 100;
        var munt50 = rest / 50;
        rest = rest % 50;
        var munt20 = rest / 20;
        rest = rest % 20;
        var munt10 = rest / 10;
        rest = rest % 10;
        var munt5 = rest / 5;
        rest = rest % 5;
        var munt2 = rest / 2;
        rest = rest % 2;
        var munt1 = rest;
        System.out.println("Uw teruggeld:");
        System.out.println("Munt 1.00 EUR: " + munt100);
        System.out.println("Munt 0.50 EUR: " + munt50);
        System.out.println("Munt 0.20 EUR: " + munt20);
        System.out.println("Munt 0.10 EUR: " + munt10);
        System.out.println("Munt 0.05 EUR: " + munt5);
        System.out.println("Munt 0.02 EUR: " + munt2);
        System.out.println("Munt 0.01 EUR: " + munt1);
    }
}
