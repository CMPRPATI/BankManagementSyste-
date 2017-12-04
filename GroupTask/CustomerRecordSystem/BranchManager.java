public class BranchManager
{
    // instance variables - replace the example below with your own 
// instance variables - replace the example below with your own
    private Account accounts[];
    private BranchEmployee employees[];
    
    public BranchManager()
    {
        accounts  = new Account[4];
        accounts[0] = new Account("Will Bloom", "45 Trove Road, Wigan, WN4 3DF", 1232, 50);
        accounts[1] = new Account("Tom Smith", "100 Bull Street, Preston, PR23 5FG", 6543, 90);
        accounts[2] = new Account("Vera Higgs", "Summer House, Chester, CH3 2BN", 7865, 100);
        accounts[3] = new Account("Bettie Green", "Town Road, Reading, RD43, 7AS", 5245, 200);
        
        employees  = new BranchEmployee[4];
        employees[0] = new BranchEmployee("Gill Brown", "Devon House, Liverpool, L21 9FT", 4342, "9.00am");
        employees[1] = new BranchEmployee("Sammy Davies", "45 Binute Road, Chester", 2234, "OFF WORK");
        employees[2] = new BranchEmployee("Jimmy Downs","12 Apple Street, Nottingham, NN3 6FG", 8765, "10.00am, 13.00pm");
        employees[3] = new BranchEmployee("Vicky Taylor", "87 Windle Way, Stoke, ST56 4DS", 8765, "9.00am - 11.00am");
        
    }

    private Account viewAccount(long accountnumber)
    {
        for (int index=0; index < accounts.length; index++)
        {
           if (accounts[index].accountnumber == accountnumber)
              return accounts[index];
        }
        return null;
    }
   
    private BranchEmployee ListAppointments(long id)
    {
        for (int index=0; index < employees.length; index++)
        {
           if (employees[index].id == id)
              return employees[index];
        }
        return null;
    }
    public void transaction(int accountnumber, int transactionType, int amount)
    {
       Account tempAccount;
       tempAccount = ViewAccount (account);
       if (tempAccount != null)
       {
           if (transactionType == 0)
              tempAccount.deposit(amount);
           else
              tempAccount.withdraw(amount);
        }
        else
           System.out.println("Account not found");
    }

    public void printAccounts()
    {
        for (int index=0; index < accounts.length; index++)
        {
           accounts[index].print();
        }
        
   }

    public void printBranchEmployee()
    {
        for (int index=0; index <e.length; index++)
        {
           employee[index].print();
        }
        
   }
}
