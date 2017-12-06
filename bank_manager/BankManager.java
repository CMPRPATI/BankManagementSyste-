public class BankManager
{
    // instance variables - replace the example below with your own
    private Account accounts[];

    public BankManager()
    {
        accounts = new Account[4];
        accounts[0] = new Account("John Smith", 12345, 100);
        accounts[1] = new Account("Jane Smith", 23451, 100);
        accounts[2] = new Account("James Black", 34521, 100);
        accounts[3] = new Account("Sue White", 45321, 100);
    }

    private Account accessAccount(long idValue)
    {
        for (int index=0; index < accounts.length; index++)
        {
           if (accounts[index].id == idValue)
              return accounts[index];
        }
        return null;
    }
    
    public void transaction(int id, int transactionType, int amount)
    {
       Account tempAccount;
       tempAccount = accessAccount(id);
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

}
