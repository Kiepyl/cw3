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
    public void wyswietlInfo(){
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
}
