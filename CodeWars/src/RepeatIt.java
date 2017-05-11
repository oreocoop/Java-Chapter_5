/**
 * Created by rcooper2 on 4/24/2017.
 */
public class RepeatIt {

    public static void main(String[] args){
        System.out.println(repeatString("Hi", 2));
        System.out.println(repeatString('H', 2));
        System.out.println(repeatString(3, 2));
        System.out.println(repeatString(3.0, 2));
        System.out.println(repeatString(new Integer(3), 2));
    }

    public static String repeatString(final Object toRepeat, final int n) {
        String retVal = "";

        if (!(toRepeat instanceof String)){
            return "Not a string";
        } else {
            for (int i = 0; i < n; i++) {
                retVal = retVal + toRepeat;
            }
        }
    return retVal;
    }
}
