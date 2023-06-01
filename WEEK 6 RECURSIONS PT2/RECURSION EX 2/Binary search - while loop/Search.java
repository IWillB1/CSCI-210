public class Search
{
    public int search(int list[], int left, int right, int target)
    {
        int mid;
        while (left <= right) {        //NOTE: <= is necessary
            mid = (left + right) / 2;
            if (list[mid] > target)
                right = mid - 1;
            else if (list[mid] < target)
                left = mid + 1;
            else    //found target
                return mid;
        }
        return -1;
    }
}
