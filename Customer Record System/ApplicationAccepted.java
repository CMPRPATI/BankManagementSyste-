/**
 * Author: Rebecca Patient 
 * Date: 03/12/2017
 * 
 * Program: ApplicationAccepted.java
 * Description: Program to permit user to input personal data including type of application, credit card / bank details details.
 *				
 * On completion of input - all data is validated and message outputted to screen to illustrate if user can be given the 
 * specific application type.
 *
 */

// Output all constructors of ApplicationAccepted extending to CustomerApplication.
public class ApplicationAccepted extends CustomerApplication {

    //Declare into to valueOfHouse	  
    private int valueOfAccount;

    // Output all constructors of ApplicationAccepted
    public ApplicationAccepted() {
    	super();
	
    } 	
    // Output ApplicationAccpeted by getting all methods (amount,duration, valueOfAccount)which do return a value on the application.	
	public ApplicationAccepted(int amount,String duration, int valueOfAccount ) {
		
		super("SEC",amount,duration);
		setValueOfAccount(valueOfAccount);
	
    }
					    
    // This section will validate if the this loan is valid ?
    // Using boolean: true = yes or false = no
    
    boolean isApplicationValid() {
    	
    	if ( getValueOfAccount() > 0 )
    	// if the application amount is more than 0 for ApplicationAccepted return a true value.
    		return true;
    		//otherwise
    	else	
    		// if the application amount is not more than 0 for ApplicationAccepted return a true value.
    		// The valueOfHouse must use an inputted value to work.
    		return false;	
    }
    
    
    // set all the methods on the frame and output to screen, returning no value.
     
	public void setValueOfAccount(int valueOfAcount) {
    	this.valueOfAccount = valueOfAccount;
    }

    // get all methods on the frame and and output to screen, returning values.

    public int getValueOfAccount() {
		return this.valueOfAccount;
	}
}
    