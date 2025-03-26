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
        }
        if (students.contains(student)) {
            System.out.println("Student is already in this group");
        }
        students.add(student);
    }

    public void groupInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
