package be.vdab;

import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.LeesBoek;
import be.vdab.voorwerpen.WoordenBoek;

public class Hoofdprogramma {
    public static void main(String[] args) {

        Voorwerp[] voorwerpen = new Voorwerp[6];
        voorwerpen[0] = new Boekenrek();
        voorwerpen[1] = new Boekenrek(75, 90, 28.5F);
        voorwerpen[2] = new LeesBoek();
        voorwerpen[3] = new LeesBoek("Leesboek Java 21", "Oracle", 20.4F, "genre Informatica", "onderw programmeren");
        voorwerpen[4] = new WoordenBoek();
        voorwerpen[5] = new WoordenBoek("Woordenboek Engels", "Van Dale", 30.10F, "genre vertaal woordenboek", "taal Engels-Nederlands");

        float totWinst = 0;
        for (Voorwerp voorwerp : voorwerpen) {
            voorwerp.gegevensTonen();
            System.out.println();
            totWinst += voorwerp.winstBerekenen();
        }
        System.out.println("Totale winst: " + totWinst);
    }
}
