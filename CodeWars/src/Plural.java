/**
 * Created by rcooper2 on 4/13/2017.
 *
 * Create a simple function that determines if a plural is needed or not.
 * It should take a number, and return true if a plural should be used with that number or false if not.
 * This would be useful when printing out a string such as 5 minutes, 14 apples, or 1 sun.
 */

public class Plural {

    public static void main(String[] args){

        System.out.println(isPlural(0.5f));
    }

    public static boolean isPlural(float f){
        boolean val = true;

        if (f == 1){
            val = false;
        }
        //return val;
        return (f==1) ? true : false;
    }
}
