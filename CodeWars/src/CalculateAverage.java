import java.lang.reflect.Array;

/**
 * Created by rcooper2 on 3/31/2017.
 */
public class CalculateAverage {

    public static void main(String[] Args){

        int[] listOfNumbers = {1, 2, 3};
        System.out.println(find_average(listOfNumbers));
    }

    public static double find_average(int[] array){

        double average;
        double sum = 0.0;

        for (int x = 0; x < array.length; x++){
            sum += array[x]; //sum = sum + array[x]
        }
        average = sum / array.length;
        return average;
    }
}
