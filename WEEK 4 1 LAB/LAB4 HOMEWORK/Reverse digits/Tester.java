public class Tester
{
    public static void main()
    {
        String number = "12345";

        //you must write all your code here
        StackInterface<Character> s = new LinkedStack<Character>();

        //push all digits to the stack
        int len = number.length();
        for (int i = 0; i < len; ++i)
            s.push(number.charAt(i));

        //pop the stack and the digits are reversed
        while (!s.isEmpty())
            System.out.print(s.pop());       
    }
}
