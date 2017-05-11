/**
 * Created by rcooper2 on 4/18/2017.
 */
public class Number {

    public static void main(String[] args){

        System.out.println(isEven(-4));
    }


    public static boolean isEven(double n) {
//        boolean retValue = false;
//
//        if (n % 2 == 0){
//            return true;
//        }
//        return retValue;
        return (n % 2 == 0);
    }
}
