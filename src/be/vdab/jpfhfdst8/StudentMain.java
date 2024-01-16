package be.vdab.jpfhfdst8;

public class StudentMain {
    public static void main(String[] args) {
        var student1 = new Student("Johnny");
        var student2 = new Student("Bob", 7);
        System.out.println("Student 1: " + student1.getNaam());
        System.out.println("Student 1 score: " + student1.getScore());
        System.out.println("Student 2: " + student2.getNaam());
        System.out.println("Student 2 score: " + student2.getScore());

        student1.setNaam("Johnny K");
        student1.setScore(10);

        System.out.println("Student 1: " + student1.getNaam());
        System.out.println("Student 1 score: " + student1.getScore());
    }
}
