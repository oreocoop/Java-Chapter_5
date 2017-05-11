/**
 * Created by rcooper2 on 12/14/2016.
 */
import java.util.Scanner;

public class Homework07
{
    public static void main(String[] args)
    {
        int i = 1;
        double x = 3.4;
        String s = "hi!";

        System.out.println(i + " " + x + " " + s);
        changUs(i, x, s);
        System.out.println(i + " " + x + " " + s);

        //Homework Problem 3
        boolean homeworkProblem3 = isSecondStringSameAsFirstInReverse("foo","bar");
        System.out.println(homeworkProblem3);
        homeworkProblem3 = isSecondStringSameAsFirstInReverse("racecar", "racecar");
        System.out.println(homeworkProblem3);
        homeworkProblem3 = isSecondStringSameAsFirstInReverse("1331", "1331");
        System.out.println(homeworkProblem3);


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
}