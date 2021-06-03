package aop;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
      Student st1 = new Student("Roman", 3, 7.6);
      Student st2 = new Student("Mihail", 4, 7.0);
      Student st3 = new Student("Ivan", 1, 8.6);
      students.add(st1);
      students.add(st2);
      students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
