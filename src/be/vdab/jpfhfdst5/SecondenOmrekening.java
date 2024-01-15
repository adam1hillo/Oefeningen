package be.vdab.jpfhfdst5;

import java.util.Scanner;

public class SecondenOmrekening {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Geef seconden");
        var seconden = scanner.nextInt();
        var uren = seconden / 3600;
        seconden = seconden % 3600;
        var minuten = seconden / 60;
        seconden = seconden % 60;
        System.out.println("U:" + uren + " M:" + minuten + " S:" + seconden);
    }
}
