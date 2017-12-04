/**
 * Author: Rebecca Patient 
 * Date: 12/12/2017
 * 
 * Program: CustomerApplication.java
 * Description: Program to permit user to input personal data including type of loan, credit card / bank details details.
 *				
 * On completion of input - all data is validated and message outputted to screen to illustrate if user can be accepted 
 * or declined.
 *
 */

//Declare the public class as MortgageLoan.
public class CustomerApplication {
	
  // Variables declared using String, int, Duration.

	// Declare: Secured or UnSecured. 
        private String  typeOfApplication;		
	// Declare the initial amount of application.
	private int amount;				
	// Declare the duration for years.
	private String duration;			
 
    // Add constructors here to Customer ,if required and output to screen.
    public CustomerApplication() {
    
    }
    //Ouput CustomerApplication to screen using the variables by setting names for method.
    public CustomerApplication( String  typeOfApplication , int amount , String duration ) {
    	
    	setTypeOfApplication(typeOfApplication);
    	setAmount(amount);
    	setDuration(duration);
  
    }

    // Output CustomerApplication - set all methods (TypeOfApplication,Amount,Duration) which do not return a value on the application.

    public void setTypeOfApplication(String  typeOfApplication )    {
		  this.typeOfApplication = typeOfApplication;
	}
	
	public void setAmount(int amount )    {
		  this.amount = amount;
	}
     
	public void setDuration(String duration )    {
		  this.duration = duration;
	}

       // Output CustomerApplication by getting all methods (TypeOfApplication,Amount,Duration)which do return a value on the application.

	public String getTypeOfApplication() {
		return this.typeOfApplication;
	}

	public int getAmount() {
		return this.amount;
	}

	public String getDuration() {
		return this.duration;
	}
}