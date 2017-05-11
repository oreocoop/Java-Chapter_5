import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rcooper2 on 4/18/2017.
 *
 * Find the last element of a list.
 */
public class FindLastElementInList {

    public static void main(String[] args){

        //System.out.println(last(1, 2 ,3 ,4 ,6));
        System.out.println(last("q", "w" ,5 ,"e" ,"r" ,"t", "y", 1));
        System.out.println(last("abcde-abcde-abcde"));
        final List<Integer> list = Arrays.asList(1, 2 ,3 ,4 ,5,99);
        System.out.println(last(list));
    }




    public static <T> T last(final List<T> list) {
        return list.get(list.size()-1);
    }

    public static char last(final String string) {
        return string.charAt(string.length()-1);
    }

    public static <T> T last(T... list) {
        return list[list.length-1];
    }
}
