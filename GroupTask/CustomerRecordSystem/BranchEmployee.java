
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BranchEmployee
{  
 private String employee;
   private String address1;
   public long id;
   private String appointments;
   
     public BranchEmployee(String name1, String address1, long id, String appointments) 
   {
      employee = name1;
      address1 = address1;
      id = id;
      appointments = appointments;
   }
  
   public void print()
   {
      System.out.println("Employee = "+ employee + "   ID = " + id + 
            " Appointments = " + appointments);
   }      

}

