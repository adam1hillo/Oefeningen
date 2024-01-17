package be.vdab.jpfhfdst10;

public class Vrachtwagen extends Voertuig {
    private float maxLading = 10000F;

    public Vrachtwagen() {
    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setMaxLading(maxLading);
    }


    public float getMaxLading() {
        return maxLading;
    }

    public final void setMaxLading(float maxLading) {
        if (maxLading >= 0.0F) {
            this.maxLading = maxLading;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; " + maxLading;
    }

    @Override
    public void toon() {
        System.out.println("\nVRACHTWAGEN");
        super.toon();
        System.out.println("Max lading: " + maxLading + "\n");
    }
    @Override
    public double getKyotoScore() {
        return (getGemVerbruik()*getPk() / (maxLading/1000.0F) );
    }
}
