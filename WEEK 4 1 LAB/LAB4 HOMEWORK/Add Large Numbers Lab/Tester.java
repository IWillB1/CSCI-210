import java.util.Stack; 

/**
 * <h2>Tester - The application will be to add large numbers</h2>
 * CSCI 210 - Dynamic Implementation of Stack
 * @author Will Bouasisavath
 * @version Lab 4, 10/10/2020
 */

public class Tester
{
    public static void main(String[] args)
    {
        //first shorter
        //String first = "1";
        //String second = "2147483647";

        //second shorter
        //String first = "2147483647";
        //String second = "1";

        //same length
        String first = "2147483647";
        String second = "2147483647";

        // stacks to store the first number, second number
        // and the result of their sum
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Stack<Integer> result = new Stack<Integer>();

        // insert first string into stack
        for(int i = 0; i < first.length(); i++)
        {
            int c = (int)(first.charAt(i)) - '0';
            stack1.push(c);
        }

        // insert second string into stack
        for(int i = 0; i < second.length(); i++)
        {
            int c = (int)(second.charAt(i)) - '0';
            stack2.push(c);
        }

        System.out.println(stack1.toString());
        System.out.println(stack2.toString());

        int carry = 0;

        // sum the digit of stack1 and stack2 till
        // one of the stack become empty
        while(!stack1.isEmpty() && !stack2.isEmpty())
        {
            int x = stack1.pop();
            int y = stack2.pop();
            int sum = x + y + carry;
            carry = sum/10;

            result.push(sum%10);
        }

        // copy the remaining stack
        while(!stack1.isEmpty())
        {
            result.push(stack1.pop());
        }

        while(!stack2.isEmpty())
        {
            result.push(stack2.pop());
        }

        // print the result
        while(!result.isEmpty())
        {
            System.out.print(result.pop());
        }
        
    }
}