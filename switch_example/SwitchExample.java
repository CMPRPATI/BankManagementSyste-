import java.util.Scanner;
    
public class SwitchExample
{
    public static void main (String args[]) { 
       Scanner stdin = new Scanner( System.in);
       System.out.print( "Enter the number of a day of the week 1-7: ");   
       int dayNumber = stdin.nextInt();
       switch(dayNumber) 
       {
          case 1:
             System.out.println("Today is Monday");
             break;
          case 2:
             System.out.println("Today is Tuesday");
             break;
          case 3:
             System.out.println("Today is Wednesday");
             break;
          case 4:
             System.out.println("Today is Thursday");
             break;
          case 5:
             System.out.println("Today is Friday");
             break;
          case 6:
             System.out.println("Today is Saturday");
             break;
          case 7:
             System.out.println("Today is Sunday");
             break;
          default:
             System.out.println("Invalid input: enter a number 1-7");
             break;
       }
    } 
}
