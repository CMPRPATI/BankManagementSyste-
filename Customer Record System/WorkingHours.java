
/**
 * Write a description of class WorkingHours here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorkingHours
{
   public static void main(String... args) {
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
}
