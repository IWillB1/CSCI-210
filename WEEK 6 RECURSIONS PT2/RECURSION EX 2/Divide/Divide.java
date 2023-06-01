public class Divide
{
    int divide(int n, int d)
    {
        if (n < d)
            return 0;
        return 1 + divide(n - d, d);
    }
}
