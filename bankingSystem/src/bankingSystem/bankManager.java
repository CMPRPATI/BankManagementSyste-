package bankingSystem;

import java.util.Scanner;

public class bankManager {

	customerAccount customerdetail = new customerAccount();
	
	///
	

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|              Welcome To Our            |");
		System.out.println("|           Banking Simulation Menu      |");
		System.out.println("+----------------------------------------+");
		System.out.println("+----------------------------------------+");
		System.out.println("|          Please Log In To Continue     |");
		System.out.println("+----------------------------------------+");
		System.out.println("+----------------------------------------+");
		
		
		
	    Scanner input = new Scanner(System.in);

	    String username;
	   

	    System.out.println("Please Enter User Log In Details");
	    System.out.println("\nUsername: ");
	    username = input.next();


	    if(username.equals("amy1234")) {
	    	System.out.println("You are logged in");
	    	
	    	customerdetail.();
	    	
	        
	    }
	    
	        else if(username.equals("john1234"))  {
	        	 System.out.println("You are logged in as jj" + username);
	        	 
	        	 
	        	 
	        }
	        else
	        {
	        	System.out.println("please enter vaild details");
	        }
	        
	    
	}
	
	
	
	
}

