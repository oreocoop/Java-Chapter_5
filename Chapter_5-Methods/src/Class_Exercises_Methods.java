import java.util.Date;

/**
 * Created by rcooper2 on 12/1/16.
 *
 1. Write a method to take 2 integers and print out the higher one

 2. Write a method to take 2 integers and a boolean, if the boolean is true return the higher one, if false return lower one

 3. Write a method to take a string and return the inverse of the string

 4. Write a method to take a string and return a string with all spaces replaced by a comma

 5. Write a method that takes a URL (http://www.google.com/index.html) as a string and returns the FQDN (www.google.com) as a String.

 6. Write a method header to take a Date object and a integer and return a Date object that represents the original date object incremented by that many hours. Maybe you can write the method too?

 7. Write a method that takes 2 Date objects and returns the difference in minutes as an integer. Maybe you can write the method too?
 */
public class Class_Exercises_Methods
{
    public static void main(String[] args)
    {
        printHigherInt(5,2);
        System.out.println();
        printHigherInt(2,5);
        System.out.println("--------------------");
        //returnHigherOrLowerOne(5,2,true);
        System.out.println(returnHigherOrLowerOne(5,2,true));
        //returnHigherOrLowerOne(5,2,false);
        System.out.println(returnHigherOrLowerOne(5,2,false));
        System.out.println("--------------------");
        System.out.println(returnInverseString("Is this even going to work?"));
        System.out.println("--------------------");
    }

    //Create a new method that takes two integers and prints out the higher one.
    static void printHigherInt(int a, int b)
    {
        int printInt;
        if (a > b) {
            printInt = a;
        } else {
            printInt = b;
        }
        System.out.println(printInt);
    }

    //Create a method that takes 2 integers and a boolean. if the boolean is true, return the higher one, if false return the lower one.
    static int returnHigherOrLowerOne(int c, int d, boolean trueOrFalse)
    {
        int result;
        if (c > d && trueOrFalse == true) {
            result = c;
        } else if (c < d && trueOrFalse == true) {
            result = d;
        } else if (c > d && trueOrFalse == false) {
            result = d;
        } else {
            result = c;
        }
        return result;
    }

    //Write a method to take a string and return the inverse of the string
    static String returnInverseString(String s)
    {
        String output = "";
        for (int counter = s.length() - 1; counter > 0; counter--){
            output += s.charAt(counter);
        }
    return output;
    }

    //Write a method to take a string and return a string with all spaces replaced by a comma
    static String returnCommas(String s)
    {
        String outputCommas = "";


        return outputCommas;
    }
}
