import model.Course;
import model.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JavaObjectWorkshop {
    @Test
    public void workWithObjects(){
        Student lena = new Student();

        lena.setFirstName("Lena");
        lena.setLastName("Tripathi");
        lena.getAge(18);
        lena.getEmail("lena@inbox.lv");

        //---CONTSTRUCTOR--------------
        Student raimonds = new Student("Raimonds", "Geislers", 19, "raimonds@gmail.com");

//        raimonds.setFirstName("Raimonds");
//        raimonds.setLastName("Geislers");
//        raimonds.setAge(19);
//        raimonds.setEmail("raimonds@gmail.com");

//        System.out.println(lena.getFirstName() + " " + lena.getLastName());
//        System.out.println(lena.getFullName());
//        System.out.println(raimonds.getFirstName() + " " + raimonds.getLastName());

        List<Student> students = new ArrayList<Student>();
        students.add(lena);
        students.add(raimonds);
        students.add(new Student("liga", "blabla", 18, "ahaa"));

        Course qa2 = new Course("QA2 - Automation", 3, students);
        qa2.addStudent(new Student("Dmitr","adkdkd", 19,"dkdkdk"));

        qa2.printInfo();
    }
}
