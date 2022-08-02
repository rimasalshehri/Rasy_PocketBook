import java.util.Scanner;

public class SavingsOverYears extends Helper
{
    private double monthly_salary;
    
    private double monthly_entertainment;
    private double total_entertainment;
    
    private double monthly_savings;
    private double total_savings;
    
    private double monthly_ncessity;
    private double total_necessity;

    
    //first constructor that takes all of the attributes as arguments
    public SavingsOverYears(double mS, double tS, double mE, double tE, double mSav, double tSav, double mN, double tN,String n, int numOfYears)
    {
        setNumberOfYears(numOfYears);
        setName(n);
        monthly_salary = mS;
        setTotalSalary(tS);
        monthly_entertainment = mE;
        total_entertainment = tE;
        monthly_savings = mSav;
        total_savings = tSav;
        monthly_ncessity = mN;
        total_necessity = tN;
    }

    //second constructor 
    public SavingsOverYears()
    {
        String first,last;
        System.out.println("enetr your first name");
        first=getKeyboard().nextLine();
        System.out.println("enetr your last name");
        last=getKeyboard().nextLine();
      
      UserName(first,last);
      int numOfYears;
      
      
      double [] years=new double[100];// just initialized a value so it works
      
      System.out.println("Enter number of years you want to count for your monthly salary ");
      numOfYears=getKeyboard().nextInt();
      setNumberOfYears(numOfYears);
      double yearly_salary=0;
      setTotalSalary(0);
      for(int i=0;i<numOfYears;i++)
      {
          System.out.println("Enter your monthly Salary for year: "+(i+1));
          years[i]=getKeyboard().nextDouble();
          yearly_salary=years[i]*12;
          setTotalSalary(getTotalSalary()+yearly_salary);
      }
      total_savings=yearly_salary*0.2;
      total_entertainment=yearly_salary*0.3;
      total_necessity=yearly_salary*0.5;
      
      System.out.println(GetSavingsDetails());
      
      
    }

   
    
    /**  
     * Method that returns the details of a User's Savings (to String method)
     *@return message that will display the details of savings on both file and run screen
     */
    public String GetSavingsDetails()
    {
        String message;
        message="\nyour total salary for "+getNumberOfYears()+ " years is= "+getTotalSalary()+"\n"
                +"your total savings for "+getNumberOfYears()+ " years is= "+ total_savings+"\n"+"your total entertainment for "
                + getNumberOfYears()+" years is= "+total_entertainment+"\n"+
                "your total necessity for "+getNumberOfYears()+" years is= "+total_necessity;
        return message;
    }
    /**  
     * Method that displays UserName
     *@param f that takes first name
     * @param l that takes last name
     */
    public void UserName(String f,String l)
    {
        setName(f+" "+l);
    }
    /** Monthly Salary setter method
     * @param mS that is assigned to monthly_salary
     */
    public void setMonthly_salary(double mS) 
    {
       monthly_salary = mS;
    }
    /**Monthly Salary getter method
     * @return monthly_salary
     */
    public double getMonthly_salary() 
    {
        return monthly_salary;
    }
    /** Monthly entertainment setter method
     * @param mE that is assigned to monthly_entertainment
     */
    public void setMonthly_entertainment(double mE)
    {
       monthly_entertainment = mE;
    }
    /** Monthly entertainment getter method
     * @return monthly_entertainment
     */
    public double getMonthly_entertainment() 
    {
        return monthly_entertainment;
    }
    /** Monthly Savings setter method
     * @param mSav that is assigned to monthly_savings
     */
    public void setMonthly_savings(double mSav)
    {
       monthly_savings = mSav;
    }
    /** Monthly savings getter method
     * @return monthly_savings
     */
    public double getMonthly_savings()
    {
        return monthly_savings;
    }
    /** Monthly necessity setter method
     * @param mN that is assigned to monthly_necessity 
     */
    public void setMonthly_ncessity(double mN)
    {
        monthly_ncessity = mN;
    }
    /** Monthly necessity getter method
     * @return monthly_salary
     */
    public double getMonthly_ncessity() 
    {
        return monthly_ncessity;
    }
    /** Total entertainment setter method
     * @param tE that is assigned to total_entertainment
     */
    public void setTotal_entertainment(double tE) 
    {
        total_entertainment = tE;
    }
    /** Total entertainment getter method
     * @return total_entertainment
     */
    public double getTotal_entertainment() 
    {
        return total_entertainment;
    }
    /** total savings setter method
     *@param tSav that is assigned to total_savings
     */
    public void setTotal_savings(double tSav)
    {
        total_savings = tSav;
    }
    /** Total savings getter method
     *@return Total_savings
     */
    public double getTotal_savings() 
    {
        return total_savings;
    }
     /** Total necessity setter method
      * @param tN that is assigned as total necessity
      */ 
    public void setTotal_necessity(double tN)
    {
        total_necessity = tN;
    }
    /** Total necessity getter method
    *@return total_necessity 
    */
    public double getTotal_necessity()
    {
        return total_necessity;
    }
    
}