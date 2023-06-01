/**
 * <h2>Hello.java - is an example of Java class syntax.</h2>
 * 
 * @author Will Bouasisavath
 * @version 8/28/2021
 */
public class Hello
{
    // example instance variable
    private int doesNothing;

    /**
     * Constructor method for objects of class Hello
     */
    public Hello()
    {
        doesNothing = 0;    // initialize all instance variables
    }
 
    /**
     * Example method that sends output to the Terminal Window
     */
    public void sayHello()
    {
        System.out.print("Hello, world!\n");
        System.out.println("doesNothing is: " + doesNothing);
    }
}