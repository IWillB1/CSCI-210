public class Search
{
    public int search(int list[], int left, int right, int target)
    {
        if (left > right)
            return -1;

        int mid = (left + right) / 2;
        if (list[mid] > target)
            //Java requires that every path returns an int
            return search(list, left, mid - 1, target);
        else if (list[mid] < target)
            return search(list, mid + 1, right, target);
        else    //found id
            return mid;
    }
}
