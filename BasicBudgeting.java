
public class BasicBudgeting
{
    private double Salary;
    private double savingsPerMonth;
    private double entertainmentPerMonth;
    private double necessityPerMonth;

    private Helper helper = new Helper();
    
    
    // first constructor that takes all of the private attributes as arguments.
    public BasicBudgeting(double s,double savPerM, double ePerM,double nPerM,String n)
    {
        helper.setName(n);
        Salary=s;
        savingsPerMonth=savPerM;
        entertainmentPerMonth=ePerM;
        necessityPerMonth=nPerM;
    }
    
    //second constructor
    public BasicBudgeting() 
    {
        PrintDetails();
        
        String f, l;
        System.out.println("Enter your first name ");
        f=helper.getKeyboard().nextLine();
        
        System.out.println("Enter your last name ");
        l=helper.getKeyboard().nextLine();
        System.out.println(UserName(f,l));
        
         double monthlysalary;
        
        System.out.println("Enter your monthly Salary");
        monthlysalary=helper.getKeyboard().nextDouble();
        
        while(monthlysalary<=0)
        {
            System.out.println("Wrong Input");
            System.out.println("Enter your monthly Salary");
            monthlysalary=helper.getKeyboard().nextDouble();
        }
        
        BudgetDistribution(monthlysalary);
    }

   
    
    /** just a void method that prints some statements
     */
    public void PrintDetails()
    {
        System.out.println("This class will display the Name and the Budget Distribution for a user.");
        System.out.print("This Distribution is based on: " +"\n-taking 20%"+" of your monthly Salary for Savings");
        System.out.println("\n-and 30% of your Salary for monthly Entertainment "+
                "\n-and 50% of your Salary for Monthly Necessities ");   
    }
    
    /** Method that will display the user's full name
     * @param first that takes the first name
     * @param last that takes the last name
     * @return name
     */
    public String UserName(String first,String last)
    {
        helper.setName(first+" "+last);
        return helper.getName();
    }
    
    /** Method that will Calculate user's basic budgeting
     * @param s that assigns it to Salary
     */
    public void BudgetDistribution(double s)
    {
       //here we should validate the salary so it doesn't accept -ve #Ù…Ù…ÙƒÙ† Ù†Ø³ÙˆÙŠÙ‡ Ù‡Ù†Ø§ Ø§Ùˆ Ù†Ø³ÙˆÙŠ ÙÙŠ Ø§Ù„ Ù…ÙŠÙ† ÙƒÙ„Ø§Ø³ 
       Salary=s;
        
       savingsPerMonth=(Salary*0.2);
       //System.out.println("your savings per month should be: "+savingsPerMonth);
        
       entertainmentPerMonth=(Salary*0.3);
        //System.out.println("your entertainment budget per month should be: "+entertainmentPerMonth);
       
       necessityPerMonth=(Salary*0.5);
        //System.out.println("your necessity budget per month should be: "+necessityPerMonth);
        
        System.out.println(GetBudget());
    }
    
    /** Method that will print details of budget (to String method)
     * @return message which will contain all of user's budget details
     */
    public String GetBudget()
    {
        String message;
        message="\nYour Saving per month are  "+savingsPerMonth+"\nYour entertainment buget is "+entertainmentPerMonth+"\nYour necessity "
                + "budget is "+necessityPerMonth;
        return message;
    }

    /** Salary setter method
     * @param s that assigns it to Salary
     */
    public void SetSalary(double s)
    {
       Salary=s;
    }
    /** Salary getter method
     * @return Salary
     */
    public double GetSalary()
    {      
        return Salary;
    }
    /** Savings setter method
     * @param savPerM that assigns it to savingsPerMonth
     */
    public void SetSavings(double savPerM)
    {
        savingsPerMonth=savPerM;
        //savingsPerMonth=(Salary*0.2);
    }
    /** Savings getter method
     * @return savingsPerMonth
     */
    public double GetSavings()
    {
      //return savingsPerMonth=(Salary*0.2);
      return savingsPerMonth;
    }
   /** Entertainment setter method
    * @param ePerM that is assigns it to EntertainmentPerMonth
    */
   public void SetEntertainment(double ePerM)
   {
       entertainmentPerMonth=ePerM;
   }
   /** Entertainment getter method
    * @return EntertainmentPerMonth
    */
   public double GetEntertainment()
   {
      //return entertainmentPerMonth=(Salary*0.3);
       return entertainmentPerMonth;
   }
   /** Necessity setter method
    * @param nPerM that assigns it to NecessityPerMonth
    */
   public void SetNecessity(double nPerM)
   {
       necessityPerMonth=nPerM;
   }
   /** Necessity getter method
    * @return NecessityPerMonth
    */
   public double GetNecessity()
   {
       //return necessityPerMonth=(Salary*0.5);
       return necessityPerMonth;
   }

    public String getName() {
        return helper.getName();
    }
}