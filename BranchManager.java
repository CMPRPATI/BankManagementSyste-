
/**
 * Write a description of class BranchManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * @param <Customer>
 */
public class BranchManager
{  
// instance variables - replace the example below with your own
 
private RecordSystem recordsystem[];
public BranchManager()
 {
 
 }
 
 public void transaction(int accountnumber, int transactionType, int amount)
 {
    Customer tempcustomeraccount;
    tempcustomeraccount = (Customer)customeraccount(accountnumber);
    if (tempcustomeraccount != null)
    {
        if (transactionType == 0)
           ((Customer) tempcustomeraccount).deposit(amount);
        else
           ((Customer) tempcustomeraccount).withdraw(amount);
     }
     else
        System.out.println("customer account not found");
 }

 private Customer customeraccount(int customeraccountnumber) {
	return null;
}

public void applicationprocess (int customeraccountnumber, int transactionType, int amount, String application)
 {
    Customer tempapplication;
    tempapplication = ProcessApplication(customeraccountnumber);
    if (tempapplication != null)
    {
        if (transactionType == 0)
           tempapplication.deposit(amount);
        else
           tempapplication.withdraw(amount);
           
     }
     else
        System.out.println("application account not found");
 }
 
 private Customer ProcessApplication(int customeraccountnumber) {
	return null;
}

public BranchEmployee[] getAppointment(BranchEmployee[] appointment) {
		return appointment; 
 } 

 public BranchEmployee[] getBranchEmployee(BranchEmployee[] branchemployee) {
		return branchemployee;
 }
 
 public Customer[] getCustomer(Customer[] customer) {
		return (Customer[]) customer;
 }
 
  public Customer[] getApplicatiom(Customer[] application) {
		return application;
 }
 
 public void setBranchEmployee(BranchEmployee[][] branchemployee) {
		this.setBranchemployee(branchemployee);
 }
 
 public void setCustomer(Customer customer[]) {
 }
 
 public void printcustomeraccounts(Object[] customeraccount)
 {
     for (int index=0; index < customeraccount.length; index++)
           {
              ((BranchEmployee)customeraccount[index]).print();
           }
 }

  public void printapplication(Object[] application)
 {
     for (int index=0; index < application.length; index++)
           {
              ((BranchEmployee) application[index]).print();
           }
 }
 
 public RecordSystem[] getRecord() {
	return recordsystem;
}

public void setRecord(RecordSystem recordsystem[]) {
	this.recordsystem = recordsystem;
}

/**
 * @return the branchemployee
 */
public BranchEmployee[] getBranchemployee() {
	return null;
}

/**
 * @param branchemployee the branchemployee to set
 * @param recordsystem 
 */
public void setBranchemployee(BranchEmployee[] branchemployee, RecordSystem[] recordsystem) {
	this.recordsystem = recordsystem;
}

/**
 * @param branchemployee the branchemployee to set
 */
public void setBranchemployee(BranchEmployee[] branchemployee[]) {
}
}
