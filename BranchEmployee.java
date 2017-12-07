/**
 * This class is BranchEmployee it holds all variables and methods for the employee
 *
 * @author 699434
 * @version 07/12/2017
 */
public class BranchEmployee  {
        
       private BranchEmployee branchEmployee[];

       public BranchEmployee(String name, String address, int accountnumber, int balance) {
       super();
    }
       private String Employee;
       private String Appointment;
       private String name;

       public void Employee(String employee,String appointment, String name) 
       {
         
          setEmployee(name);
          Appointment = appointment;
       }
        
       public void appointment(String anAppointment, String name)
       {
           System.out.println(" List of Current Employees & Appintments\n");
           System.out.println(" Employee Name: " + name +  " Appointment: " + anAppointment);
       }

       public void print()
       {
           System.out.println("Employee = "+ name + " appointment = " + Appointment);
       }

       public String getEmployee() {
        return Employee;
       }

        public void setEmployee(String employee) {
        Employee = employee;
       }

    /**
     * @return the branchEmployee
     */
      public BranchEmployee[] getBranchEmployee() {
            return branchEmployee;
        }

    /**
         * @param branchEmployee the branchEmployee to set
         */
        public void setBranchEmployee(BranchEmployee branchEmployee[]) {
            this.branchEmployee = branchEmployee;
        }

//branchemployee methods
//show schedule
private void Workinghours() {

}
//list customer appointment (whom & when)
private void CustomerAppointments() {

}
//refer customer to branchmanger
private void CustomerApplications(){
    
}

//list branchemployee & specialism
private void FinancialServicesSpecialism() {

}
//view calender for upcoming appointments
private void Calendar() {

 }
}
