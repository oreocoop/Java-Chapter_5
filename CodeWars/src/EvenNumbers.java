import java.util.ArrayList;

/**
 * Created by rcooper2 on 4/14/2017.
 *
 * Write a function which takes two arguments and returns all number, which are divisible by given divisor.
 * First argument is array of numbers and the second is divisor.
 *
 * Example:
 * divisibleBy([1,2,3,4,5,6], 2) == [2,4,6]
 */
public class EvenNumbers {

    public static void main(String[] args){

        System.out.println(divisibleBy(new int[] {0, 1,2,3,4,5,6}, 4));

    }



    public static int[] divisibleBy(int[] numbers, int divider) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                temp.add(numbers[i]);
            }
            System.out.println(temp);

        }
        int[] retVal = new int[temp.size()];

        return retVal;

    }
}
