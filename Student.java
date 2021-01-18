package school.management.system;

/**
 * This class is responsible for keeping track of
 * student fees, fees paid, name, and grade.
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a student by Initializing.
     * Fees for every student is gonna be $30,000.00
     * Fees paid initially is $0
     * @param id is the ID of student: Unique
     * @param name is the name of the student
     * @param grade is the grade of the student
     */
    public  Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //Not going to alter Student's Name or Id


    /**
     * Used to update the student's grade
     * @param grade is the student's new grade
     */
    public void setGrade(int grade){
        this.grade = grade;
    }



    /**
     * Keep adding the fees to the feesPaid field
     * @param fees is the fees the student pays
     */
    public  void payFees(int fees){
        feesPaid+= fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return ID of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return Name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Grade of the student
     */
    public int getGrade() {
        return grade;
    }
    /**
     *
     * @return Fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }
    /**
     *
     * @return Total Fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+"\nTotal fees paid: $"+feesPaid;
    }
}
