import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String nazwa;
    public List<Student> students;
    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
}
