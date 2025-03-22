import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fName;
    public String lName;
    public String indexNum;
    public String email;
    public String address;
    public List<Double> grades;

    public Student(String fName, String lName, String indexNum, String email, String address) {
        this.fName = fName;
        this.lName = lName;
        this.indexNum = indexNum;
        this.email = email;
        this.address = address;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public void studentInfo() {
        System.out.println(fName + " " + lName + " " + indexNum + " " + email + " " + address);
        System.out.println(grades);
    }

    public double getAvgGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void avgGradeRounded() {
        double avgGrade = getAvgGrade();
        if (avgGrade == 0) {
            System.out.println("Brak ocen");
        }
        if (avgGrade >= 2 && avgGrade < 2.25) {
            System.out.println(2);
        }
        if (avgGrade >= 2.25 && avgGrade < 2.75) {
            System.out.println(2.5);
        }
        if (avgGrade >= 2.75 && avgGrade < 3.25) {
            System.out.println(3);
        }
        if (avgGrade >= 3.25 && avgGrade < 3.75) {
            System.out.println(3.5);
        }
        if (avgGrade >= 3.75 && avgGrade < 4.25) {
            System.out.println(4);
        }
        if (avgGrade >= 4.25 && avgGrade < 4.75) {
            System.out.println(4.5);
        }
        if (avgGrade >= 4.75) {
            System.out.println(5);
        }
    }
}