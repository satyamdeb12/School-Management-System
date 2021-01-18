package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy", 2000);
        Teacher mellisa = new Teacher(2, "Mellisa", 3000);
        Teacher voldemort = new Teacher(3, "Voldemort", 2500);

        List<Teacher>  teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(voldemort);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshit = new Student(2, "Rakshit", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshit);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        tamasha.payFees(5000);
        rakshit.payFees(6000);
        System.out.println("GHS has earned: $"+ghs.getTotalMoneyEarned());

        System.out.println("--------------Making the school pay salary-------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS paid salary to "+lizzy.getName()+" and now has $"+ghs.getTotalMoneyEarned());
        voldemort.receiveSalary(voldemort.getSalary());
        System.out.println("GHS paid salary to "+voldemort.getName()+" and now has $"+ghs.getTotalMoneyEarned());

        System.out.println(rakshit);
        System.out.println(lizzy);
    }
}
