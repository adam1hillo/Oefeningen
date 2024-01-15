package be.vdab.jpfhfdst5;


public class Studentscores {
    public static void main(String[] args) {

        var score1 = 8;
        var score2 = 6;
        var score3 = 9;
        var score4 = 4;

        var gemiddelde = (score1 + score2 + score3 + score4) / 4F;
        var behaaldePerc = (score1 + score2 + score3 + score4) / 40F * 100;
        System.out.println("Het gemiddelde is: " + gemiddelde);
        System.out.println("Het behaalde percentage is: " + behaaldePerc + "%");
    }
}
