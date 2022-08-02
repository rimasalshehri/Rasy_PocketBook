import java.util.Scanner;

public class Helper {
    private String name;
    private int numberOfYears;
    private Scanner keyboard;

    private double totalSalary;

    public Helper() {
        keyboard = new Scanner(System.in);
    }


    /**
     * Method that displays Full Name
     *@param n that takes the Full name of the user
     */
    public void setName(String n){
        name=n;
    }
    /**
     * Method that displays UserName
     * @return name which returns the full name of the user
     */
    public String getName(){
        return name;
    }

    public Scanner getKeyboard() {
        return keyboard;
    }

    /** Number of years setter method
     * @param numberOfYears that is assigned to numOfYears
     */
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    /** Number of years getter method
     * @return numOfYears
     */
    public int getNumberOfYears() {
        return numberOfYears;
    }

    /** Total salary setter method
     * @param tS that is assigned to total_salary
     */
    public void setTotalSalary(double tS)
    {
        totalSalary = tS;
    }
    /** Total salary getter method
     * @return totalSalary
     */
    public double getTotalSalary()
    {
        return totalSalary;
    }
}
