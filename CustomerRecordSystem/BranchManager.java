
/**
 * Write a description of class BranchManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 public class BranchManager extends CustomerRecordSystem
 {
  
  // start attributes
  private String CurrEmployees;
  private String Appointments;
  private String Applications;
  private String CustomerAccounts;
  private String EmployeeDetails;
  // end attributes
  
  // start methods

  public String getAppointments() {
    return Appointments;
  }

  public String getApplications() {
    return Applications;
  }

  public String getCustomerAccounts() {
    return CustomerAccounts;
  }

  public String getEmployeeDetails() {
    return EmployeeDetails;
}
  // end methods
} // end of BranchManager

