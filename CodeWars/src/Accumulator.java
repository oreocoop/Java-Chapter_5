import java.util.Collections;

/**
 * Created by rcooper2 on 4/6/2017.
 */
public class Accumulator {

    public static void main(String[] args){

        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        String accumulatedString = "";

        for (int x = 0; x < s.length(); x++){
            for (int y = 0; y < x + 1; y++){
                if (y == 0) {
                    accumulatedString += Character.toString(s.charAt(x)).toUpperCase();
                }
                else {
                    accumulatedString += Character.toString(s.charAt(x)).toLowerCase();
                }
            }
            accumulatedString += "-";
        }
        return accumulatedString.substring(0, accumulatedString.length()-1);
    }
}
