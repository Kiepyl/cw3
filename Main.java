public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student("Janek", "Kowalski", "s11111","jk@gmail.com","Jablkowa1");
        Student Student2 = new Student("Kacper", "Kanik", "s11112", "kk@gmail.com","Kacperkowa12");
        Student1.addGrade(4);
        Student1.addGrade(5);
        Student2.addGrade(3);
        Student2.addGrade(2);
        Student2.addGrade(4);
        Student1.wyswietlInfo();
        Student2.wyswietlInfo();
        StudentGroup grupa = new StudentGroup("Grupa1");
        grupa.addStudent(Student1);
        grupa.addStudent(Student2);
        System.out.println(Student2.getAvgGrade());
    }
}