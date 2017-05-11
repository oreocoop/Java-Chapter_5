/**
 * Created by rcooper2 on 5/11/2017.
 *
 * Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives
 * become positives.
 *
 * Python/JS/PHP/Java:
 * invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
 * invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
 * invert([]) == []
 */

public class InvertValues {

    public static void main(String[] args){

        System.out.println(invert(new int[]{1,2,3,4,5}));
    }

    public static int[] invert(int[] array) {

        int[] returnVal = new int[array.length];
        for (int i = 0; i < array.length; i++){
            returnVal[i] = array[i] *= -1;
        }

        return returnVal;
    }
}
