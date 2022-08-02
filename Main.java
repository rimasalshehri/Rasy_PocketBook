import java.io.*;
import java.util.Scanner;

/** @author Rimas Alshehri
 *  @author Rawasy Alqahtani
 *  OOP1 course Project
 */
public class Main
{
    public static BasicBudgeting basic;
    private static SavingsOverYears x;
    private static Charity r;


    public static void main(String[] args) throws IOException 
    {
        Scanner keyboard=new Scanner(System.in);
        /**
         *  @param choice that accepts the choice of the user
         *  @param input1 which is assigned to the String value of "yes"
         *  @param input2 that accepts a string value from the user which is supposed to be either yes or no
         *  @param input3 that accepts a string value from the user which is supposed to be either yes or no
        */
       int choice;
       
       String input1="yes";
       String input2;
       String input3;
       System.out.println("Hello, Welcome to Rasy PocketBook ;) ");
        System.out.println("Enter  1 to Find out your basic budget according to your salary ");
        System.out.println("Enter  2 to Find out Your Saving/Entertainment/Necessity Budgets according "
                + "to your monthly Salary");
        System.out.println("Enter  3 to Calculate Your Charity according to your preferred percentage from "
                + "your salary");
                System.out.println("Enter -1 to exit the system");

         System.out.println("\t Make Sure to enter a number between 1 to 3 to get the service");
       choice=keyboard.nextInt();
       while(choice>=0)
      {
        
        switch(choice){
       //BasicBudgeting basic=new BasicBudgeting(1000,500,200,300,"Rimas Nawi");
            case 1:
                /**
                 * Calling an object/"reference variable" which is called basic from the BasicBudgeting Class
                 */
                basic = new BasicBudgeting();
                System.out.println("BASIC BUDGETING ");
                 keyboard.nextLine();  //consuming new line
              System.out.println("If You want to Write You Data in a File type YES or NO ");
              input2=keyboard.nextLine();
              if (input1.equalsIgnoreCase(input2))
              {
              /** here is an object/"reference variable" called (fw) of class FileWriter
               * @param text that will be used to print data in the file
               */
              FileWriter fw=new FileWriter("UserData.txt");
              
              String text="Name: ";
              text=text+basic.getName()+basic.GetBudget();
              
              fw.write(text);
              fw.close();
              System.out.println("the file has been written SUCCESSFULLY!");
              
              System.out.println("do you want to read the file type YES or NO ");
              
              input3=keyboard.nextLine();
              if(input1.equalsIgnoreCase(input3)){
                  /** here is an object/"reference variable" called file of class File
                   * that will read data from a file
                   * we used hasNextLine function to check if there is a next line
                   * we created a scan object of class Scanner which will allow us to read from the file
                   * we used nextLine to keep reading from a file while there are still lines
                   */
                  File file=new File("UserData.txt");
    
                  Scanner scan=new Scanner(file);
                  System.out.println("reading from a file");
                  while(scan.hasNextLine())
                  {
                   System.out.println(scan.nextLine());
                  }
              }  
              
             }
             else{
                  System.out.println("Data is not written in a file");
              }
              
              break;
            
            case 2:
                /** calling an object/"reference variable" which is called x from the SavingsOverYears class
                 */
              x = new SavingsOverYears();
              System.out.println("SAVINGS OVER YEARS");
              
                 keyboard.nextLine();
              System.out.println("If You want to Write You Data in a File type YES or NO");
              input2=keyboard.nextLine();
              if (input1.equalsIgnoreCase(input2))
              {
              //here i have to revise lab2
              FileWriter fw1=new FileWriter("SavingsData.txt");
                 /** here is an object/"reference variable" called (fw1) of class FileWriter
                   * @param text that will be used to print data in the file
                   */
              String text="Name: ";
              text=text+x.getName()+x.GetSavingsDetails();
              
              fw1.write(text);
              fw1.close();
              System.out.println("the file has been written SUCCESSFULLY!");
              
              System.out.println("do you want to read the file type YES or NO");
              
              input3=keyboard.nextLine();
              if(input1.equalsIgnoreCase(input3)){
                  File file=new File("SavingsData.txt");
                   /** here is an object/"reference variable" called file of class File
                     * that will read data from a file
                     * we used hasNextLine function to check if there is a next line
                     * we created a scan object of class Scanner which will allow us to read from the file
                     * we used nextLine to keep reading from a file while there are still lines
                     */
                  Scanner scan=new Scanner(file);
                  System.out.println("reading from a file");
                  while(scan.hasNextLine())
                  {
                   System.out.println(scan.nextLine());
                  }
              }  
              
             }
             else{
                  System.out.println("Data is not written in a file");
              }
              
              break;
              
            case 3:
                /** calling an object/"reference variable" which is called r from the Charity class
                 */
                r = new Charity();
                System.out.println("Charity Calculation ");
                keyboard.nextLine();
                
                System.out.println("If You want to Write You Data in a File type YES or NO");
              input2=keyboard.nextLine();
              if (input1.equalsIgnoreCase(input2))
              {
              
              FileWriter fw2=new FileWriter("CharityData.txt");
                  /** here is an object/"reference variable" called (fw2) of class FileWriter
                    * @param text that will be used to print data in the file
                    */
             String text="Name: ";
              text=text+r.getName()+r.getCharityDetails();
              
              fw2.write(text);
              fw2.close();
              System.out.println("the file has been written SUCCESSFULLY!");
              
              System.out.println("do you want to read the file type YES or NO");
              
              input3=keyboard.nextLine();
              if(input1.equalsIgnoreCase(input3)){
                  File file=new File("CharityData.txt");
                     /** here is an object/"reference variable" called file of class File
                     * that will read data from a file
                     * we used hasNextLine function to check if there is a next line
                     * we created a scan object of class Scanner which will allow us to read from the file
                     * we used nextLine to keep reading from a file while there are still lines
                     */
                 Scanner scan=new Scanner(file);
                  System.out.println("reading from a file");
                  while(scan.hasNextLine())
                  {
                   System.out.println(scan.nextLine());
                  }
              }  
              
            }
            else{
                  System.out.println("Data is not written in a file");
              }
          
                break;
                
            default:
                System.out.println("Wrong Input");
             
        }
        
        System.out.println("\nEnter  1 to Find out your basic budget according to your salary ");
        System.out.println("Enter  2 to Find out Your Saving/Entertainment/Necessity Budgets according "
                + "to your monthly Salary");
        System.out.println("Enter  3 to Calculate Your Charity according to your preferred percentage from "
                + "your salary");
        System.out.println("Enter -1 to exit the system");
        System.out.println("\t Make Sure to enter a number between 1 to 3 to get the service");
        
       choice=keyboard.nextInt();
     }
       System.out.println("You Exit the system successfully");
    }
}

