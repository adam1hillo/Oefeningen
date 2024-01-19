package be.vdab.jpfhfdst13.voorwerpen;

public class WoordenBoek extends Boek{

    private String taal;
    private static final float WINSTMARGE = 1.75F;

    public WoordenBoek() {
        this("Woordenboek NEderlands", "Van Dale", 25.8F, "verklarend woordenboek", "taal Nederlands");
    }

    public WoordenBoek(String titel, String auteur, float aankoopprijs, String genre, String taal) {
        super(titel, auteur, aankoopprijs, genre);
        setTaal(taal);
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        if (!taal.isBlank()) {
            this.taal = taal;
        }
    }

    public static float getWinstmarge() {
        return WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Taal : " + taal );
        System.out.println("Winst : " + winstBerekenen() );
    }

    @Override
    public float winstBerekenen() {
        return getAankoopPrijs() * getWinstmarge();
    }
    @Override
    public String toString() {
        return super.toString() + "; " + taal + "; " + WINSTMARGE;
    }
}
