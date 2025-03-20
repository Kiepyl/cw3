import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public String fName;
    public String lName;
    public String indexNum;
    public String email;
    public String address;
    public List<Double> grades;

    public Zadanie1(String fName, String lName, String indexNum, String email, String address) {
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
}
