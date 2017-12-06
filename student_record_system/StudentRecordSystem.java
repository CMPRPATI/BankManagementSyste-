public class StudentRecordSystem
{
    private StudentRecord students[];

    // constructor
    public StudentRecordSystem()
    {
       students = new StudentRecord[4];
       students[0] = new StudentRecord("John Smith", 12345, 
                      "Java");
       students[1] = new StudentRecord("Jane Smith", 23451, 
                      "Security");
       students[2] = new StudentRecord("James Black", 34521, 
                      "Databases");
       students[3] = new StudentRecord("Sue White", 45321, 
                      "Java");
    }

    public void print()
    {
       for (int index=0; index < students.length; index++)
          students[index].print();
    }
}
