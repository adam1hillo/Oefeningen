package be.vdab.jpfhfdst12;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Typ een zin:");
        String zin = scanner.nextLine().toLowerCase();
        int aantalKlinkers = 0;
        for (int i = 0; i < zin.length(); i++) {
            char letter = zin.charAt(i);
            if ("aeiou".indexOf(letter) > -1) {
                aantalKlinkers++;
            }
        }
        System.out.println("Aantal klinkers: " + aantalKlinkers);
    }
}
