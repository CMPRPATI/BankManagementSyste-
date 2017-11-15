import java.util.Scanner;
/**
 * Write a description of class BankManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankManager
{
     int balance;
     int amount;
     int previousTransaction;
     String BankEmpName;
     String cID;
    
   BankManager(String BankMName, String BankMID){
    
       BankMName = BankMName;
       BankMID = BankMID;
    } 
    void deposit(int amount)
   {
    if(amount !=0)
     {
       balance = balance + amount;
       previousTransaction = amount;
   
     }
    }
   void withdraw(int amount)
   {
    if (amount !=0)
     {
        balance = balance - amount;
        previousTransaction = amount;
     }
    }
   void getPreviousTransaction()
   {
     if(previousTransaction > 0)
      {
        System.out.println("Deposited: "+ previousTransaction);
      }
       else if(previousTransaction < 0)
      {
        //Math.obs used because it will take number and provide positive value. 
        System.out.println("withdrawn: "+Math.abs(previousTransaction)); 
      }
      }
   void showMenu()  
    {
         int Option = 0;
        
        Scanner input = new Scanner(System.in);
        
	System.out.println("Welcome " + BankEmpName);
        System.out.println("Your ID is " + cID);
        System.out.println("\n");
        System.out.println("[1] Balance");
        System.out.println("[2] Deposit");
        System.out.println("[3] Withdraw");
        System.out.println("[4] Previous Transaction");
        System.out.println("[5] Exit");
        
        do{
        
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Enter an option");
            System.out.println("[~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            Option = input.nextInt();
          
            switch(Option)
            {
            case 1:
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Balance = " + balance);
            System.out.println("[~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            break;
         
            case 2:
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Enter amount to deposit");
            System.out.println("[~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            int amount = input.nextInt();
            deposit(amount);
            break;
            
            case 3:
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println(" Enter amount to withdraw");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            int amount2 = input.nextInt();
            deposit(amount2);
            break;
            
            case 4:
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            getPreviousTransaction();
            System.out.println("[~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            break;
            
            case 5:
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            break;
            
            default:
            System.out.println("Invalid Option, Please choose between (1-5) only.");
        }
    } while (Option != 5);
      System.out.println("Thankyou for using our services - Please come back soon.");
    }
    }
