public class Customer 
{
private RecordSystem customer[];

public Customer(String name, String address, int accountnumber, int balance) {
		super();
}

private String Customer;
   public long AccNumber;
   private int Balance;
   private String Application;

 
public void Application(String name, long accountnumber, int balanceValue, String application) 
   {
      Customer = name;
      AccNumber = accountnumber;
      Balance = balanceValue;
      Application = application;
   }
   
   public void deposit(int anAmount)
   {
      Balance = Balance + anAmount;
   }

   public void withdraw(int anAmount)
   {
      if (anAmount <= Balance) 
         Balance = Balance - anAmount;
      else
         System.out.println("Insufficient Funds");
   }    

   public void printcustomer()
   {
      System.out.println(" Customer = "+ Customer + "   AccountNumber = " + AccNumber + 
            "   Balance = " + Balance);
   }
  
   public void printapplication()
   {
      System.out.println(" Customer = "+ Customer + "   AccountNumber = " + AccNumber + 
            "   Balance = " + Balance + " Application " + Application);
   }

public void print() {
	
	
}

/**
 * @return the customer
 */
public RecordSystem[] getCustomer() {
	return customer;
}

/**
 * @param customer the customer to set
 */
public void setCustomer(RecordSystem customer[]) {
	this.customer = customer;
}

//methods of customer
//current balance  
private void Balance(){
	
}
//recent / past transactions
private void Transactions(){
	
}
//Add / change details
private void PersonalDetails(){

}

//request appointment 
private void FinancialServices() {

}

public static int nextInt() {
	// TODO Auto-generated method stub
	return 0;
}
}
