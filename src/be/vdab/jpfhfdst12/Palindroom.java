package be.vdab.jpfhfdst12;

public class Palindroom {

    private final StringBuilder orgTekst, revTekst;

    public Palindroom(String tekst) {
        orgTekst = new StringBuilder(tekst);
        revTekst = new StringBuilder(tekst);
        revTekst.reverse();
    }

    public boolean isPalindroom (boolean hooflettergevoelig) {
        if (hooflettergevoelig) {
            return orgTekst.toString().contentEquals(revTekst);
        } else {
            String ot = orgTekst.toString().toLowerCase();
            String rt = revTekst.toString().toLowerCase();
            return ot.equals(rt);
        }
    }
    public StringBuilder getOrgTekst() {
        return orgTekst;
    }

    public StringBuilder getRevTekst() {
        return revTekst;
    }
}
