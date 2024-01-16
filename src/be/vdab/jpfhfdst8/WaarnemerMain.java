package be.vdab.jpfhfdst8;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class WaarnemerMain {
    public static void main(String[] args) {

        var thermometer = new Waarnemer();
        var scanner = new Scanner(System.in);
        System.out.println("Geef temperatuur in (999 om te stoppen):");
        var temperatuur = scanner.nextDouble();
        while (temperatuur != 999) {
            thermometer.registreer(temperatuur);
            System.out.println("Geef temperatuur in:");
            temperatuur = scanner.nextDouble();
        }
        System.out.println("Het aantal waarnemingen is: " + thermometer.getAantalWaarnemingen());
        System.out.println("De hoogste temperatuur is: " + thermometer.getMaxTemp());
        System.out.println("De laagste temperatuur is: " + thermometer.getMinTemp());
        System.out.println("De gemiddelde temperatuur is: " + thermometer.getGemiddelde());
    }
}
