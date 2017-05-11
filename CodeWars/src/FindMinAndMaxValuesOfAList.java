/**
 * Created by rcooper2 on 2/6/2017.
 */
public class FindMinAndMaxValuesOfAList
{
    public static int min (int[] list)
    {
        int smallestValue = list[0];
        for (int x = 1; x < list.length; x++)
        {
            if (list[x] < smallestValue)
            {
                smallestValue = list[x];
            }
        }
        return smallestValue;
    }

    public int max(int[] list)
    {
        int largestValue = list[0];
        for (int x = 0; x < list.length; x++)
        {
            if (list[x] > largestValue)
            {
                largestValue = list[x];
            }
        }
        return largestValue;
    }
}
