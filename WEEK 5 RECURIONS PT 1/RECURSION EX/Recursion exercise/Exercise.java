import java.io.IOException;

public class Exercise
{
    public void foo() throws IOException
    {
        char c;

        c = (char) System.in.read();
        if (c != '.')
            foo();
        System.out.print(c);
    }
}
