package be.vdab.jpfhfdst8;

public class Waarnemer {
    private double minTemp = Double.MAX_VALUE;
    private double maxTemp = Double.MIN_VALUE;
    private int aantalWaarnemingen;
    private double somTemp;

    public double getMinTemp() {
        return aantalWaarnemingen > 0 ? minTemp : 0;
    }
    public double getMaxTemp() {
        return aantalWaarnemingen > 0 ? maxTemp : 0;
    }

    public int getAantalWaarnemingen() {
        return aantalWaarnemingen;
    }
    public double getGemiddelde() {
        return aantalWaarnemingen > 0 ? somTemp / aantalWaarnemingen : 0;
    }

    public void registreer(double temp) {
        if (minTemp > temp) {
            minTemp = temp;
        }
        if (maxTemp < temp) {
            maxTemp = temp;
        }
        somTemp += temp;
        aantalWaarnemingen++;
    }

}
