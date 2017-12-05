import java.util.Scanner;
/**
 * Write a description of class Login here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   public class CustomerRecordSystem
{
  public static void main(String[] args){
        
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");   
    System.out.println("  Welcome To Customer Record System   \n");
    System.out.println("           Login Screen               \n");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
       

        // you need to initialize customer and employee screen.
        String BranchManagerName = "Test3";
        String BranchManagerPassword = "Test3";
        String BranchEmployeeName = "Test2";
        String BranchEmployeePassword = "Test2";
        String CustomerName = "Test1";
        String CustomerPassword = "Test1";
    
        // one Scanner for the whole program, since classes
        // arereading input from the standard input stream
        // other Scanners apply "input" and close "input" at the end
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        // not needed
        Scanner authenticate = new Scanner(System.in);
        String userName = authenticate.nextLine();
        System.out.println("Enter your password: ");
        String passWord = authenticate.nextLine();
        if (userName.equals(BranchManagerName) && passWord.equals(BranchManagerPassword)) {
            System.out.println(" Welcome:  " + BranchManagerName + "  What would you like to do today? \n");                
            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
            int selection;

            Scanner BranchManagerMenu = new Scanner(System.in);
            System.out.println("1. Current Employees & Appointments");
            System.out.println("2. Overview of Customer Accounts");
            System.out.println("3. Outstanding Customer Applications");
            System.out.println("4. Add / Remove Customers Accounts");
            System.out.println("5. Add / Remove Employees");
            System.out.println("6. Quit");

            do {
                selection = BranchManagerMenu.nextInt();

                if (selection == 1) {
                    System.out.println("Current Employees & Appointments ");
                }
                else if (selection == 2) {
                     System.out.println("Overview of Customer Accounts ");
                }
                else if (selection == 3) {
                    System.out.println("Outstanding Customer Applications");
                }
                else if (selection == 4) {
                    System.out.println("Add / Remove Customers Accounts");
                }
                else if (selection == 5) {
                    System.out.println("Add / Remove Employees");
                }
                    else {
                    System.out.println("Thanks for Testing - Goodbye !!");
                }  
            } while(selection != 6); // exits system
                BranchManagerMenu.close();
            }
            else if (userName.equals(BranchEmployeeName) && passWord.equals(BranchEmployeePassword)) {
                System.out.println(" Welcome:  " + BranchEmployeeName + "  What would you like to do today? \n");          
            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
            int selection;

            // don't need this one, just use "input" Scanner
            Scanner BranchEmployeeMenu = new Scanner(System.in);
            System.out.println("1. Employee Information");
            System.out.println("2. Working Hours");
            System.out.println("3. Customer Appointments");
            System.out.println("4. Financial Services Specialism");
            System.out.println("5. Calender for Upcoming Appointments");
            System.out.println("6. Add / Remove Employees");
            System.out.println("7. Quit");
            
            do {
                selection = BranchEmployeeMenu.nextInt();

                if (selection == 1) {
                    System.out.println("Employee Information");
                }
                else if (selection == 2) {
                      System.out.println("Working Pattern of Hours");
                      
                     String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday\n"};
                     String[] daysOffWeek = {"Saturday & Sunday"};
                     String[] timesOfWeek = {"9.00am - 5.00pm\n"};
                     
                     System.out.println("Working Life of the Employee: ");
                     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
                     System.out.println("______");
                     System.out.println("Hours: ");
                     System.out.println("______\n");
                     for (int y = 0; y< timesOfWeek.length; y++){
                        System.out.println(timesOfWeek[y] + "");
                      }
                      System.out.println("_________________");
                      System.out.println("Days of the Week: ");
                      System.out.println("_________________\n");
                      for (int i = 0; i< daysOfWeek.length; i++){ 
                      System.out.println(daysOfWeek[i] + "");
                     }
                      System.out.println("_________");
                      System.out.println("Days Off: ");
                      System.out.println("_________\n"); 
                      for (int x = 0; x< daysOffWeek.length; x++){
                      System.out.println(daysOffWeek[x] + "");
                     } 
                }
                else if (selection == 3) {
                    System.out.println("Customer Appointments");
                }
                else if (selection == 4) {
                    System.out.println("Financial Services Specialism");
                }
                else if (selection == 5) {
                    System.out.println("Calender for Upcoming Appointments");
                }
                else if (selection == 6) {
                    System.out.println("Add / Remove Employees");
                }
                else {
                    System.out.println("Quit");
                }  
            } while(selection != 7); // this is usually here

            // you would close the "input" Scanner here
            BranchEmployeeMenu.close();
           }
    
          else if (userName.equals(CustomerName) && passWord.equals(CustomerPassword)) {
                   System.out.println(" Welcome:  " + CustomerName + "  What would you like to do today? \n");
            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
            int selection;

            // don't need this one, just use "input" Scanner
            Scanner CustomerMenu = new Scanner(System.in);
            System.out.println("1. Customer Information");
            System.out.println("2. Past Transcations");
            System.out.println("3. Customer Financial Services");
            System.out.println("4. Current Balance");
            System.out.println("5. Recent Tranactions");
            System.out.println("6. Request Appointment At Branch");
            System.out.println("7. Quit");
            do {
                selection = CustomerMenu.nextInt();

                if (selection == 1) {
                    System.out.println("Customer Information");
                }
                else if (selection == 2) {
                    System.out.println("Past Transcations");
                }
                else if (selection == 3) {
                    System.out.println("Customer Financial Services");
                }
                else if (selection == 4) {
                    System.out.println("Current Balance");
                }
                else if (selection == 5) {
                    System.out.println("Recent Tranactions");
                }
                else if (selection == 6) {
                    System.out.println("Request Appointment At Branch");
                }
                else {
                    System.out.println("Quit");
                }  
            } while(selection != 7); // this is usually here

            // you would close the "input" Scanner here
            CustomerMenu.close();
            }
          else{
               System.out.println("Invalid Details - GoodBye !!!");
            }   
   }
}
