
public class Account
{

   private String customer;
   private String address;
   public long accountnumber;
   private int balance;
   
   public Account(String name, String address, long accountnumber, int balanceValue) 
   {
      customer = name;
      address = address;
      accountnumber = accountnumber;
      balance = balanceValue;
   }
   
   public void deposit(int anAmount)
   {
      balance = balance + anAmount;
   }

   public void withdraw(int anAmount)
   {
      if (anAmount <= balance) 
         balance = balance - anAmount;
      else
         System.out.println("Insufficient Funds");
   }  
   
   public void print()
   {
      System.out.println("Customer" + customer + " Address = " + address + 
            "   Balance = " + balance);
   }
   
} 
