
public class Account
{
   private String owner;
   public long id;
   private int balance;

   public Account(String name, long idValue, int balanceValue) 
   {
      owner = name;
      id = idValue;
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
      System.out.println("Owner = "+ owner + "   ID = " + id + 
            "   Balance = " + balance);
   }
   
} 
