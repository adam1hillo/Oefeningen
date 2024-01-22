package be.vdab.voorwerpen;

import be.vdab.util.Voorwerp;

public abstract class Boek implements Voorwerp {

    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;

    public Boek(String titel, String auteur, float aankoopPrijs, String genre) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
    }

    public String getTitel() {
        return titel;
    }

    public final void setTitel(String titel) {
        if (!titel.isBlank()) {
            this.titel = titel;
        }
    }

    public String getAuteur() {
        return auteur;
    }

    public final void setAuteur(String auteur) {
        if (!auteur.isBlank()) {
            this.auteur = auteur;
        }
    }

    public float getAankoopPrijs() {
        return aankoopPrijs;
    }

    public final void setAankoopPrijs(float aankoopPrijs) {
        if (aankoopPrijs > 0.0) {
            this.aankoopPrijs = aankoopPrijs;
        }
    }

    public String getGenre() {
        return genre;
    }

    public final void setGenre(String genre) {
        if (!genre.isBlank()) {
            this.genre = genre;
        }
    }

    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN EEN BOEK ") ;
        System.out.println("Titel : " + titel) ;
        System.out.println("Auteur : " + auteur) ;
        System.out.println("Het is eigendom van : " + EIGENAAR);
        System.out.println("Aankoopprijs : " + aankoopPrijs);
        System.out.println("Genre : " + genre);
    }
    @Override
    public String toString() {
        return EIGENAAR + "; " + titel + "; " + auteur + "; " + aankoopPrijs + "; " + genre;
    }
}
