import java.util.Scanner;

/**
 * start program Login for customer and employee to use record system
 *
 * @author 699434
 * @version 1 07/12/2017
 */

public class Login
{
public static void main(String[] arg){
        
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");   
    System.out.println(" 	 Welcome To Record System         \n");
    System.out.println("           Login Screen               \n");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); 
       

        // you need to initialize customer and employee screen.
        String BranchManagerName = "Test3";
        String BranchManagerPassword = "Test3";
        String BranchEmployeeName = "Test2";
        String BranchEmployeePassword = "Test2";
        String CustomerName = "Test1";
        String CustomerPassword = "Test1";
    
        new Scanner(System.in);

        System.out.println("Enter your username: ");
        // not needed
        Scanner authenticate = new Scanner(System.in);
        String userName = authenticate.nextLine();
        System.out.println("Enter your password: ");
        String passWord = authenticate.nextLine();
       
            if (userName.equals(CustomerName) && passWord.equals(CustomerPassword)) {
            System.out.println(" Welcome:  " + userName + "  What would you like to do today? \n");
            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
           
           
            System.out.println("1. Customer Details");
            System.out.println("3. Customer Financial Services");
            System.out.println("4. Current Balance");
            System.out.println("5. Tranactions");
            System.out.println("6. Request Appointment At Branch");
            System.out.println("7. Quit");
    
            int option1 = Customer.nextInt();
            switch(option1) 
            {
               case 1:
                  System.out.println("Customer Details");
                  break;
               case 2:
                  System.out.println("Customer Financial Services");
                  break;
               case 3:
                  System.out.println("Current Balance");
                  break;
               case 4:
                  System.out.println("Add / Change Personal Details");
                  break;
               case 5:
                   System.out.println("Tranactions");
                   break;   
               case 6:
                  System.out.println("Request Appointment At Branch");
                  break;
               case 7:
                  System.out.println("Quit");
                  break;
               default:
                  System.out.println("Invalid input: enter a number 1-6");
                  break;
               }
            }
          else{
                 System.out.println("Invalid Details - GoodBye !!!");
          }    
        
            if (userName.equals(BranchEmployeeName) && passWord.equals(BranchEmployeePassword)) {
                System.out.println(" Welcome:  " + BranchEmployeeName + "  What would you like to do today? \n");          
            // this could be declared at the top of the program instead of
            // redeclaring in the if...else
         
            System.out.println("1. Employee Details");
            System.out.println("2. Working Hours");
            System.out.println("3. Customer Appointments");
            System.out.println("4. Financial Services Specialism");
            System.out.println("5. Calender for Upcoming Appointments");
            System.out.println("6. Add / Remove Employees");
            System.out.println("7. Quit");

            Scanner BranchEmployee = new Scanner( System.in);
            System.out.print( "Enter option of 1-7: ");   
            int option1 = BranchEmployee.nextInt();
            switch(option1) 
            {
               case 1:
                  System.out.println("Employee Details");
                  break;
               case 2:
                  System.out.println("Working Hours");
                  break;
               case 3:
                  System.out.println("Financial Services Specialism");
                  break;
               case 4:
                  System.out.println("Calender for Upcoming Appointments");
                  break;
               case 5:
                  System.out.println("Add / Remove Employees");
                  break;
               case 6:
                  System.out.println("Refer Customers To BranchManager");
                  break;
               case 7:
                  System.out.println("Quit");
                  break;
               default:
                  System.out.println("Invalid input: enter a number 1-7");
                  break;
           
            }   
           }
            
            if (userName.equals(BranchManagerName) && passWord.equals(BranchManagerPassword)) {
                System.out.println(" Welcome:  " + BranchManagerName + "  What would you like to do today? \n");                
                // this could be declared at the top of the program instead of
                // redeclaring in the if...else

                System.out.println("1. Current Employees & Appointments");
                System.out.println("2. Overview of Customer Accounts");
                System.out.println("3. Outstanding Customer Applications");
                System.out.println("4. Add / Remove Customers Accounts");
                System.out.println("5. Add / Remove Employees");
                System.out.println("6. Quit");

                Scanner BranchManagerName1 = new Scanner( System.in);
                System.out.print( "Enter option of 1-6: ");   
                int option1 = BranchManagerName1.nextInt();
                switch(option1) 
                {
                   case 1:
                      System.out.println("Current Employees & Appointments");
                      break;
                   case 2:
                      System.out.println("Overview of Customer Accounts");
                      break;
                   case 3:
                      System.out.println("Outstanding Customer Applications");
                      break;
                   case 4:
                      System.out.println("Add / Remove Customer Accounts");
                      break;
                   case 5:
                      System.out.println("Add / Remove Employees");
                      break;
                   case 6:
                      System.out.println("Quit");
                      break;
                   default:
                      System.out.println("Invalid input: enter a number 1-6");
                      break;
                }}}}
