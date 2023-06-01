/**
 * <h2>Rectangle.java - This program represents a rectangle.</h2>
 *
 * @author: Will Bouasisavath
 * @version: 8/28/2021
 */
public class Rectangle
{
    // instance variables
    private double length ;
    private double width ;

    /** 
     * Constructor method
     * 
     * @param len length
     * @param w width
     */
    public Rectangle(double len, double w)
    {
        // initialize instance variables
        length = len ;
        width = w ;
    }

    /**
     * Method that calculates area
     * 
     * @return calculateArea
     */
    public void calculateArea()
    {
        System.out.println("Area is: " + (length * width)) ;
    }
}
