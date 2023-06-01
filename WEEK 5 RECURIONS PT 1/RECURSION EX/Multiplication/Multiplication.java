public class Multiplication
{
    public int mult(int a, int b)
    {
        if (b == 1)
            return a;
        return a + mult(a, b - 1);
    }
}
