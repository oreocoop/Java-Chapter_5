/**
 * Created by rcooper2 on 12/14/2016.
 */
import java.util.Scanner;

public class Homework07
{
    public static void main(String[] args)
    {
        //Homework Problem 2
        int i = 1;
        double x = 3.4;
        String s = "hi!";

        System.out.println(i + " " + x + " " + s);
        changUs(i, x, s);
        System.out.println(i + " " + x + " " + s);
        System.out.println("********************");


        //Homework Problem 3
        boolean homeworkProblem3 = isSecondStringSameAsFirstInReverse("foo","bar");
        System.out.println(homeworkProblem3);
        homeworkProblem3 = isSecondStringSameAsFirstInReverse("racecar", "racecar");
        System.out.println(homeworkProblem3);
        homeworkProblem3 = isSecondStringSameAsFirstInReverse("1331", "1331");
        System.out.println(homeworkProblem3);
        System.out.println("********************");

        //Homework Problem 4
        boolean homeworkProblem4 = isFirstIntegerDivisibleBySecondInteger(10,5);
        System.out.println(homeworkProblem4);
        homeworkProblem4 = isFirstIntegerDivisibleBySecondInteger(5,10);
        System.out.println(homeworkProblem4);
        System.out.println("********************");

        //Homework Problem 5
        String homeworkProblem5 = returnCharacterOrCharacters("testing");
        System.out.println(homeworkProblem5);
        homeworkProblem5 = returnCharacterOrCharacters("test");
        System.out.println(homeworkProblem5);
        System.out.println("********************");



    }
    private static void changUs(int j, double y, String t)
    {
        j = 7;
        y = -1.2;
        t = "there";
        System.out.println(j + " " + y + " " + t);
    }

    /* Homework Problem 3
    Write a method that takes two Strings as parameters and returns true if the second String is the reverse of the first
    String. Otherwise it should return false. In addition, write a main method that tests your method for a variety of
    conditions where it should return false and a variety of conditions where it should return true.
    */

    public static boolean isSecondStringSameAsFirstInReverse (String s, String t)
    {
        String reversed = "";
        for ( int i=s.length()-1; i>=0; i-- )
        {
            reversed = reversed + s.charAt(i);
        }
        return t.equals(reversed);
    }

    /* Homework Problem 4
    Write a method that takes two integers as parameters and returns true if the first integer is evenly divisible by
    the second integer, false otherwise. For example, if the integers are the pair (55, 5) the method should return
    true, while if the integers are the pair (55, 6) the method should return false. In addition, write a main method
    that tests your method for a variety of conditions where it should return true and a variety of conditions where it
    should return false.
     */

    public static boolean isFirstIntegerDivisibleBySecondInteger(int a, int b)
    {
        if (b % a == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /* Homework Problem 5
    Write a method that takes a String as input and returns a String containing the middle character of the String if
    the length of that String is odd. If the length of the String is even, your method should return the middle two
    characters. For example, if the input String is "Hello" the method should return "l" and if the input Strings is
    "Worlds" the method should return "rl". In addition, write a main method that tests your method for a variety of
    String values.
     */

    public static String returnCharacterOrCharacters (String s)
    {
        String middleCharacterString = "test";
        char middleCharacterChar;

        if (s.length() % 2 != 0)
        {
            middleCharacterChar = s.charAt(s.length() / 2);
            middleCharacterString = Character.toString(middleCharacterChar);
            return middleCharacterString;
        }
        else
        {
            return middleCharacterString.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }
    }
}