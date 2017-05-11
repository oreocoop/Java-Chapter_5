/**
 * Created by rcooper2 on 4/17/2017.
 */


public class GrassHopperArrayMean {

    public static void main(String[] args){

        System.out.println(findAverage(new int[]{1,3,5,7}));
    }



    public static int findAverage(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return sum/nums.length;
    }
}
