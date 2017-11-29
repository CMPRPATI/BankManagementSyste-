public class branchManager
{
    private CustomerRecord customer[];
    private EmployeeRecord employees[];

    // constructor
    public branchManager()
    {
       customer = new CustomerRecord[4];
       customer[0] = new CustomerRecord("John Jones", 12345, 
                      "9 apple road", "1/1/17 = -£100ATM, \n 2/4/17 = -£50 WIRE");
       customer[1] = new CustomerRecord("Anne Smith", 23451, 
                      "4 Security road","21/4/17 = -£20ATM, \n2/4/17 = +£2000 BAC");
       customer[2] = new CustomerRecord("James Black", 34521, 
                      "5 Database street","31/3/17 = -£50ATM,\n 2/4/17 = -£365 WIRE");
       customer[3] = new CustomerRecord("Sue White", 45321, 
                      "Java Lane","12/3/17 = -£1100ATM, \n2/4/17 = +£65 WILLIAMHILL");
                      
                      
       employees = new EmployeeRecord[2];
       employees[0] = new EmployeeRecord("Jockey Wilson", "12 strangford view", 
                      "MON-FRI,9-5","NEW ACCOUNTS+OVERDRAFTS");
       employees[1] = new EmployeeRecord("Shane Long", "123 Irish Street", 
                      "SAT-MON,10-6", "CREDITCARDS+LOANS");

    }
    
    public void print()
    {
       for (int index=0; index < customer.length; index++)
          customer[index].print();
    }
    
    public void printit()
    {
       for (int index=0; index < employees.length; index++)
          employees[index].printit();
    }
}
