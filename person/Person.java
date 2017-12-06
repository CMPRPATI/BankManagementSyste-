
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	// person fields
	private String name;
	private int age;
	private char sex;

	/**
	 * Constructor for objects of class Person
	 */
	public Person(String personName, int personAge, char personSex)
	{
		// initialise instance variables
		name = personName;
		age = personAge;
		sex = personSex;
	}

	/**
	 * printDetails method for objects of class Person
	 */
	public void printDetails()
	{
		System.out.println("Person details:");
		System.out.println("Name = " + name + " age = " + age + " sex = " + sex);
	}

	/**
	 * sayHello method for objects of class Person
	 * Parameter: Person type
	 */
	public void sayHello(Person person)
	{
		System.out.println(name + " says hello to " + person.name);
	}

}
