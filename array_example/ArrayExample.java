
public class ArrayExample
{
    private int values[];

    // constructor
    public ArrayExample()
    {
        values = new int[5];
        for (int index = 0; index < values.length; index++)
            values[index] = index;

    }

    public void sum()
    {
        int sum = 0;
        for (int index = 0; index < values.length; index++)
            sum = sum + values[index];
        System.out.println("Sum is: " + sum);
    }
}
