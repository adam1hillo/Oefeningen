package be.vdab.jpfhfdst8;

public class GetalMain {
    public static void main(String[] args) {
        var getal = new Getal(45);
        System.out.println(getal.toDouble());
        getal.print();
        getal.add(5);
        getal.print();
        System.out.println(getal.som(5.0F));
        System.out.println(getal.som(5.0D));
        getal.setX(5);
        System.out.println(getal.getX());

    }
}
