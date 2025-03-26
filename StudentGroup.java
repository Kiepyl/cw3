import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String nazwa;
    public List<Student> students;
    public StudentGroup(String nazwa) {
        this.nazwa = nazwa;
        this.students = new ArrayList<>();
    }

    public int groupSize(){
        int count=0;
        for (Student student : students) {
            count +=1;
        }
        return count;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
