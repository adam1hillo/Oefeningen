package be.vdab.jpfhfdst12;

public class Rekenaar {
    private String tekst;
    private int totaal;

    public Rekenaar(String input) {
        tekst = input;
        totaal = bewerking();
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String input) {
        tekst = input;
        totaal = bewerking();
    }

    public int getTotaal() {
        return totaal;
    }


    public int bewerking() {

        String[] elementen = tekst.split(" ");
        if (!elementen[0].equals("")) {
            totaal = Integer.parseInt(elementen[0]);
        } else {
            totaal = 0;
        }
        for (int i = 1; i < elementen.length; i++) {
            String bewerkingsTeken = elementen[i];
            i++;
            switch (bewerkingsTeken) {
                case "+" -> totaal += Integer.parseInt(elementen[i]);
                case "-" -> totaal -= Integer.parseInt(elementen[i]);
                case "*" -> totaal *= Integer.parseInt(elementen[i]);
                case "/" -> {
                    if (Integer.parseInt(elementen[i]) != 0) {
                    totaal /= Integer.parseInt(elementen[i]);
                    }
                }
            }
        }
        return totaal;
    }
    @Override
    public String toString() {
        return tekst + " = " + totaal;
    }
}
