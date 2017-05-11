/**
 * Created by rcooper2 on 2/3/2017.
 */
public class PlayTest {
    public static void main(String[] args) {

        Object[] objects1 = {"1"};
        Object[] objects2 = {555};

        Object o = objects1[0];
        boolean doesItEqual = o.equals("1");
        System.out.println("doesItEqual="+doesItEqual);

        Object o2 = objects2[0];
        boolean doesItEqual2 = o2.equals("555");
        boolean doesItEqual3 = o.equals(1);
        System.out.println("doesItEqual2="+doesItEqual2);
        System.out.println("doesItEqual3="+doesItEqual3);


    }


    public static String findNeedle(Object[] haystack) {
        int numOfItems = haystack.length;
        String returnValue = "found the needle at position ";

        int needleIndex = -1;
        for (int x=0;x<numOfItems;x++)
        {
            if ( haystack[x] != null && haystack[x].equals("needle") )
            {
                needleIndex = x;
            }
        }
        return returnValue + needleIndex;
    }





    public static String findNeedleShort(Object[] haystack) {
        for (int x=0;x<haystack.length;x++)
        {
            if ( haystack[x] != null && haystack[x].equals("needle") )
            {
                return "found the needle at position " + x;
            }
        }
        return "not found";
    }

}
