/**
 * <h2>Tester - for Stacks</h2>
 * CSCI 210 - Intro to Stacks
 * @author Will Bouasisavath
 * @version Lab 2, 9/5/2020
 */

public class Tester
{
    public static void main()
    {
        Stack s = new Stack() ;

        for (int x = 1; x < 6; ++x)
            s.push(x);

        while (!s.isEmpty())
            System.out.println(s.pop()) ;

        //test empty stack error            
        s.pop() ;
    }
}
