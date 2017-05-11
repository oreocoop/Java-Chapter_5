/**
 * Created by rcooper2 on 4/14/2017.
 */
public class IsItANumber {

    public static void main(String[] args){

        System.out.println(isDigit("-234.4"));
    }

    public static boolean isDigit(String s) {
        boolean retVal = false;

        try {
            int x = Integer.parseInt(s.trim());
            retVal = true;
        } catch (NumberFormatException exception){
            //keep going
        }

        try {
            float y = Float.parseFloat(s.trim());
            retVal = true;
        } catch (NumberFormatException exception){
            //keep going
        }
        return retVal;
    }
}

