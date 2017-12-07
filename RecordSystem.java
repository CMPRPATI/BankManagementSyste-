/**
 * This class is RecordSystemSystem it stores all data for the customer, employee, applicatioms, transactions
 *
 * @author 699434
 * @version 07/12/2017
 */
public class RecordSystem {
	
 private static RecordSystem[] customer = null;
 private static RecordSystem[] branchemployee = null;
 private static RecordSystem[] application = null;
 private String name;
 private String address;

{
     customer = new RecordSystem[4];
     customer[0] = new RecordSystem ("John Dunn", 12345, 100, 34434,"Loan");
     customer[1] = new RecordSystem ("Bill Smith", 23451, 100, 6787,"Mortgage");
     customer[2] = new RecordSystem ("James Black", 34521, 100, 10,"Credit Card");
     customer[3] = new RecordSystem ("Maggue White", 45321, 100, 3489, "Overdraft");
     
     branchemployee = new RecordSystem[4];
     branchemployee[0] = new RecordSystem ("Graham Bull"," 35 Call Road, Bolton, B1 3QW");
     branchemployee[1] = new RecordSystem ("Sue Town"," 98 Homer Street, liverpool,L2 6HB");
     branchemployee[2] = new RecordSystem ("Peter Jones","567 Deaker Street, London, SW1 8UG");
     branchemployee[3] = new RecordSystem ("John Bollon","Sunflower House, Summerset, SM34 4GT");
     
     application = new RecordSystem[4];
     application[0] = new RecordSystem ("Bob Hope", 65789, 100, "Accept");
     application[1] = new RecordSystem ("Gill Smith", 34566, 20, "Decline");
     application[2] = new RecordSystem ("Jack Jones", 56432, 15, "Decline");
     application[3] = new RecordSystem ("Mark Powell", 54322, 560, "Accept");

}   
public RecordSystem(String string, int i, int j, int k, String string2) {
	
}

public RecordSystem(String string, int i, int j, String string2) {
	
}

public RecordSystem(String string, String string2) {
	
}

/**
  * printDetails method for objects of class RecordSystem
 * @param name 
 * @param address 
  */
 public void printCustomer(String name, String address)
 {
  System.out.println("Customer Details: ");
  System.out.println("Name = " + name + " Address = " + address);
 }
 
 public void printEmployeeDetails(String name, String address)
 {
  System.out.println("Employee Details: ");
  System.out.println("Name = " + name + " Address = " + address);
 }
  public void printProcessApplications(String name, String address)
 {
  System.out.println("Employee Details: ");
  System.out.println("Name = " + name + " Address = " + address);
 }
 
 /**
  * sayHello method for objects of class RecordSystem
  * Parameter: customer type
 * @param name 
  */
 public void welcome(RecordSystem customer, String name)
 {
  System.out.println(name + " says hello to " + customer.name);
 }

  /**
  * sayHello method for objects of class RecordSystem
  * Parameter: customer type
  */
 public void hello(RecordSystem branchemployee)
 {
  System.out.println(name + " says hello to " + branchemployee.name);
 }

/**
 * @return the address
 */
public String getAddress() {
	return address;
}

/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
 
}




