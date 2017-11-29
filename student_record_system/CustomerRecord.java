
public class CustomerRecord
{
    private String name;
    private long account;
    private String address;
    private String transactions;

    // constructor
    public CustomerRecord(String nameValue, long accountValue, String addressValue, String transactionsValue)
    {
        name = nameValue;
        account = accountValue;
        address = addressValue;
        transactions = transactionsValue;
    }

    public void print()
    {
        System.out.println("Name: " + name + " Account: " + 
                account + " Address: " + address + "\n Transactions:" + transactions);
    }
    
}

