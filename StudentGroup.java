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
        if (students.size()>=15) {
            System.out.println("Too many students in this group");
            return;
        }
        if (students.contains(student)) {
            System.out.println("Student is already in this group");
            return;
        }
        students.add(student);
    }

    public void groupInfo() {
        System.out.println("Nazwa " + nazwa + "\nStudents " + students);
    }
}
