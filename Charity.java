
import java.util.Scanner;

public class Charity extends Helper
{
    private double monthly_salary;
    private double ratio;
    private double charity;
    
    //first constructor that takes all of my attributes as arguments
    public Charity(String n, double MS,double TS,double R,int noy,double ch)
    {
        setName(n);
        setNumberOfYears(noy);
        monthly_salary=MS;
        setTotalSalary(TS);
        ratio=R;
        charity=ch;
    }
    
    //second constructor
    public Charity()
    {
        PrintDetails();
        
        String f,l;
        System.out.println("Enter your first name: ");
        f=getKeyboard().nextLine();
        System.out.println("Enter your last name: ");
        l=getKeyboard().nextLine();
        UserName(f,l);
        
        int noy;
        double []years=new double[100]; //just initialize size
        
        System.out.println("Enter number of years you want to count your total Charity money for: ");
        noy=getKeyboard().nextInt();
        setNumberOfYears(noy);
        
        double yearly_salary=0;
        
        for(int i=0;i<noy;i++)
        {
            System.out.println("Enter your monthly salary for year "+(i+1)+": ");
            years[i]=getKeyboard().nextDouble();
            yearly_salary=years[i]*12;
            setTotalSalary(getTotalSalary()+yearly_salary);
        }
        System.out.println("Enter the percentage you would like count Charity for as 20-30-40... : ");
        ratio=getKeyboard().nextDouble();
        charity=getTotalSalary()*(ratio/100);
        
        System.out.println(getCharityDetails());
    }
    
    /** Method that will print Charity details (to String method)
     * @return message 
     */
    public String getCharityDetails()
    {
        String message;
        message="Your Charity as "+ratio+"% of your total salary which is "+getTotalSalary()+
                " during "+getNumberOfYears()+" years should equal to = "+charity;
        return message;
    }
    
    /**  
     * Method that displays UserName
     *@param first that takes first name
     * @param last that takes last name
     * @return name of user as full name
     */
    public String UserName(String first,String last)
    {
        setName(first+" "+last);
        return getName();
    }
    /** Void Method that will print some statements
     */
    public void PrintDetails()
    {
        System.out.println("This method will take your monthly salary and the percentage you would like"
                + "to give for charity out of your toatal yearly salary");
    }
    /** Charity setters method
     * @param ch that is assigned to charity
     */
    public void setCharity(double ch)
    {
        charity=ch;
    }
    /** Charity getter method
     * @return charity
     */
    public double getCharity()
    {
        return charity;
    }
    /** Monthly salary setter method
     * @param MS that is assigned to monthly_salary 
     */
    public void SetMonthly_Salary(double MS)
    {
        monthly_salary=MS;
    }
    /** Monthly salary getter method
     * @return monthly_salary
     */
    public double GetMonthly_Salary()
    {
        return monthly_salary;
    }
    /** Ratio setter method
     * @param R that is assigned to ratio
     */
    public void SetRatio(double R)
    {
        ratio=R;
    }
    /** Ratio getter method
     * @return ratio
     */
    public double GetRatio()
    {
        return ratio;
    }
}
