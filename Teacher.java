package school.management.system;

/**
 * This class is responsible for keeping track of the
 * teachers id, name, and salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * Creates a new Teacher Object
     *
     * @param id is the ID of the teacher
     * @param name is the name of the teacher
     * @param salary is the salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }


    /**
     *
     * @return id of the teacher
     */
    public int getId(){
        return id;
    }


    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }


    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set the salary
     * @param salary is the Salary of the Teacher
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     *  Adds tosalary of teachers
     *   Removes funds from total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of Teacher: "+name+"\nTotal Salary earned: $"+salaryEarned;
    }
}
