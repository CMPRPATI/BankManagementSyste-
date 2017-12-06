
/**
 * Write a description of class ATMScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
    
public class ATMScreen
{
    
    public static void menu() {
       System.out.println("  \n*** ATM Bank ***  ");
       System.out.println("  (1) Make a deposit  ");
       System.out.println("  (2) Make a withdrawal  ");
       System.out.println("  (3) Change PIN  ");
       System.out.println("  (4) Request a statement  ");
       System.out.println("  (5) Freeze the account  ");
       System.out.println("  (6) Quit ATM service  ");
       System.out.print("  Enter your option:  ");
   }
   
   public static void main(String args[]) {
       Scanner stdin = 
         new Scanner( System.in);
       boolean theEnd = false;
       int amount = 0;

       while (!theEnd) {
          menu();
          int option = stdin.nextInt();
          switch(option) {
             case 1:
                System.out.println("Enter amount to deposit");
                amount = stdin.nextInt();
                System.out.println("deposit made of: " + amount);
                break;
             case 2:
                System.out.println("Enter amount to withdraw");
                amount = stdin.nextInt();
                System.out.println("withdrawal made of: " + amount);
                break;
             case 3:
                System.out.println("Enter new PIN number");
                int newPIN = stdin.nextInt();
                System.out.println("PIN changed to: " + newPIN);
                break;
             case 4:
                System.out.println("A statement will be posted");
                break;
            case 5:
                System.out.println("Your account has been frozen");
                break;
            case 6:
                System.out.println("Session ended");
                theEnd = true;
                break;
            default:
                System.out.println("Wrong option - choose an option 1-6");
                break;
         }
       }
    }
}
