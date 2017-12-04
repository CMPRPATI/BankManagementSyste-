/**
 * Author: Rebecca Patient 
 * Date: 12/03/2017
 * 
 * Program: MortgageUnSecuredLoan.java
 * Description: Program to permit user to input personal data including type of loan, credit card / bank details details.
 *				
 * On completion of input - all data is validated and message outputted to screen to illustrate if user can be given the 
 * specific Mortgage loan type.
 *
 */
 
 // Output all constructors of ApplicationDecline extending to CustomerApplication.
 public class ApplicationDecline extends CustomerApplication    {

  // Variables declared using String.

	private int AccountNumber;

    // Add constructors here to ApplicationDecline, if required and output to screen.
	
    public ApplicationDecline() {
    }
     
       // Output ApplicationDecline by declaring(amount,duration,creditCardNumberX) with float, int, String.	
	public ApplicationDecline(int amount ,String duration , int AccountNumber) {
	// supper calls constructors to process the events.
		super("UNSEC",amount,duration);
		setAccountNumber(AccountNumber);

    }
    // This section will validate if the this application is valid ?
    // Using boolean: true = yes or false = no
       boolean isApplicationValid() {
    	if ( getAmount() > 10000 )
	// if the application amount exceeds limit for ApplicationDecline return a false value.
    		return false;		
    	//otherwise
    	else
        // if the application amount exceeds limit for ApplicationDecline loan return a false value.	
    		return true;
    }
    
      // This section will get and set all methods in the frame.    
    
       // set all the methods on the frame and output to screen, returning no value.
	public void setAccountNumber (int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

 
        // get all methods on the frame and and output to screen, returning values.
	public int getAccountNumber() {
		return this.AccountNumber;
	}
	
 
}
	