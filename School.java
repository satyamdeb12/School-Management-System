package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * New school object is created
     * @param teachers is the list of teachers in the school
     * @param students is the list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds a teacher in the school
     * @param teacher is the teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *  Add student to the school
     * @param student is the student to be added
     */
    public void setStudents(Student student){
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *  Adds the total money earned by the school
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *  Update the money spent by the school (Just the teacher's salary in this case)
     * @param moneySpent is the money spent by the school
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}
