public class EmployeeRecord
{
    private String name;
    private String address;
    private String rota;
    private String services;

    // constructor
    public EmployeeRecord(String nameValue, String addressValue, String rotaValue, String servicesValue)
    {
        name = nameValue;
        address = addressValue;
        rota = rotaValue;
        services = servicesValue;
    }

    public void printit()
    {
        System.out.println("Name: " + name + " address: " + address + "Working Hours: " + 
        rota + "\nFinancial Services: " + services);
    }
    
}