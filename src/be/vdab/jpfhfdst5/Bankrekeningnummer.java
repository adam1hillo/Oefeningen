package be.vdab.jpfhfdst5;

public class Bankrekeningnummer {
    public static void main(String[] args) {

        var bankreknr = 823445816730L; //OK
//        var bankreknr = 237824199569L; //OK
//        var bankreknr = 662431212859L; //OK
//        var bankreknr = 737524091952L; //OK
//        var bankreknr = 111224444891L; //NOK
//        var bankreknr = 777553241844L; //NOK

        var laatsteCijfers = (int)(bankreknr%100);
        var eersteCijfers = bankreknr/100;
        var isGeldig = (int)(eersteCijfers%97) == laatsteCijfers;
        System.out.println("Bankrekeningnummer is geldig: " + isGeldig);
        System.out.println(laatsteCijfers);
        System.out.println((int)(eersteCijfers%97));
    }
}
