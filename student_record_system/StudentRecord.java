
public class StudentRecord
{
    private String name;
    private long id;
    private String course;

    // constructor
    public StudentRecord(String nameValue, long idValue, String courseValue)
    {
        name = nameValue;
        id = idValue;
        course = courseValue;
    }

    public void print()
    {
        System.out.println("Name: " + name + " ID: " + 
                id + " Course: " + course);
    }
}
