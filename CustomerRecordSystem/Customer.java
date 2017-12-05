
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

  public class Customer extends CustomerRecordSystem
  {
  
  // start attributes
  String Name;
  private String Address;
  private int CurrBalance;
  private int AccountNumber;
  private String Transactions;
  private String PersonDetails;
  private String Appointment;
  // end attributes
  
  // start methods
  public String getName() {
    return Name;
  }

  public void setName(String NameNew) {
    Name = NameNew;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String AddressNew) {
    Address = AddressNew;
  }

  public int getCurrBalance() {
    return CurrBalance;
  }

  public void setCurrBalance(int CurrBalanceNew) {
    CurrBalance = CurrBalanceNew;
  }

  public int getAccountNumber() {
    return AccountNumber;
  }

  public void setAccountNumber(int AccountNumberNew) {
    AccountNumber = AccountNumberNew;
  }

  public String getTransactions() {
    return Transactions;
  }

  public void setTransactions(String TransactionsNew) {
    Transactions = TransactionsNew;
  }

  public String getPersonDetails() {
    return PersonDetails;
  }

  public void setPersonDetails(String PersonDetailsNew) {
    PersonDetails = PersonDetailsNew;
  }

  public String getAppointment() {
    return Appointment;
  }

  public void setAppointment(String AppointmentNew) {
    Appointment = AppointmentNew;
  }

  // end methods
} // end of Customer
