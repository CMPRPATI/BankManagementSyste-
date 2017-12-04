/**
 * @(#)Custoer.java
 *
 * MakeCustomer update of Customer with addition of testing
 *
 * @author 699434
 * @version 1.00 03/12/2017
 */

public class Customer {

    //attributes

    String name;
    String address;
    int accountnumber;
    int currbalance;
    
    // addition to test if correct customer

  boolean yesICustomer() {

    if (this.accountnumber > 1234){
	return true;
    } else {
	return false;
    }
   }
   //Output customer full details
   void printFullCustomer (String name,String address, int accountnumber, int curbalance){

	System.out.println(this.name + " " + address + " " + this.accountnumber + " " + this.currbalance);
	
  }

  void changeAccountnumber(int accountnumber){

	this.accountnumber = accountnumber;

    }
  
  void print() {

       System.out.println("Name : " + name);
       System.out.println("Address : " + address);
       System.out.println("Account : " + accountnumber);
       System.out.println("Current Balance : " + currbalance);
        	
        }
 }

