
/**
 * Write a description of class BranhEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BranchEmployee extends CustomerRecordSystem {
  
  // start attributes
  private String Name;
  private String Address;
  private String Appointments;
  private String WorkingHours;
  private String FinancialServices;
  private String Calender;
  private String ApplicationProcessing;
  // end attributes
  
  public BranchEmployee() {
    this.Name = "";
    this.Address = "";
    this.Appointments = "";
    this.WorkingHours = "";
    this.FinancialServices = "";
    this.Calender = "";
    this.ApplicationProcessing = "";
  }

  // start methods
  public String getName() {
    return Name;
  }

  public String getAddress() {
    return Address;
  }

  public String getAppointments() {
    return Appointments;
  }

  public void setAppointments(String AppointmentsNew) {
    Appointments = AppointmentsNew;
  }

  public void setAddress(String AddressNew) {
    Address = AddressNew;
  }

  public void setName(String NameNew) {
    Name = NameNew;
  }

  public String getWorkingHours() {
    return WorkingHours;
  }

  public void setWorkingHours(String WorkingHoursNew) {
    WorkingHours = WorkingHoursNew;
  }

  public String getFinancialServices() {
    return FinancialServices;
  }

  public void setFinancialServices(String FinancialServicesNew) {
    FinancialServices = FinancialServicesNew;
  }

  public String getCalender() {
    return Calender;
  }

  public void setCalender(String CalenderNew) {
    Calender = CalenderNew;
  }

  public String getApplicationProcessing() {
    return ApplicationProcessing;
  }

  public void setApplicationProcessing(String ApplicationProcessingNew) {
    ApplicationProcessing = ApplicationProcessingNew;
  }

  // end methods
} // end of BranchEmployee

