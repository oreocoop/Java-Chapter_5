import java.util.*;

/**
 * Created by rcooper2 on 4/10/2017.
 */
public class Kata13December {

    public static void main(String[] args){

        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
        listOfIntegers.add(1);
        listOfIntegers.add(2);
        listOfIntegers.add(2);
        listOfIntegers.add(2);
        listOfIntegers.add(4);
        listOfIntegers.add(3);
        listOfIntegers.add(4);
        listOfIntegers.add(5);
        listOfIntegers.add(6);
        listOfIntegers.add(7);

        System.out.println(filterOddNumber(listOfIntegers));
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> listOfOddNumbers = new ArrayList<Integer>();

        for ( int i = 0; i < listOfNumbers.size(); i++ ) {
            if ( listOfNumbers.get(i)%2 == 0 ) {
                continue;
            } else {
                listOfOddNumbers.add(listOfNumbers.get(i));
            }
        }
        return listOfOddNumbers;
    }
}
