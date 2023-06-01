public class Exponent
{
    int exp(int x, int n)
    {
        if (n == 0)
            return 1;
        return x * exp(x, n - 1);
    }
}
