public class Tester
{
    public static void main(String[] args)
    {
        int list[] = {10, 20, 30, 40, 50, 60, 70};

        Search s = new Search();
        //just hardcode to test various cases
        System.out.println(s.search(list, 0, 6, 60));
        System.out.println(s.search(list, 0, 6, 10));
        System.out.println(s.search(list, 0, 6, 100));
        System.out.println(s.search(list, 0, 6, 35));
    }
}
