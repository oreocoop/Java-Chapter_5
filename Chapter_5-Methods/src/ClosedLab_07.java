/**
 * Created by rcooper2 on 12/16/2016.
 *
 * A simple program that computes the number of words in an input string.
 * Used to practice breaking code up into methods.
 */

import java.util.Scanner;

public class ClosedLab_07
{
    public static void main(String[] args)
    {
        // Fill in the body with your code
        Scanner in = new Scanner(System.in);
        String input = getInputString(in);

        System.out.println(input);
        System.out.println("Your string has " + getWordCount(input) + " words in it.");

    }




    // Given a Scanner, prompt the user for a String.  If the user enters an empty
    // String, report an error message and ask for a non-empty String.  Return the
    // String to the calling program.
    private static String getInputString(Scanner inScanner)
    {
        // Fill in the body
        // NOTE: Do not declare a Scanner in the body of this method.

        while (true)
        {
            System.out.print("Enter a string: ");
            String inputString = inScanner.nextLine();

            if (inputString.equals(""))
            {
                System.out.println("ERROR - string must not be empty.");
                System.out.println();
                continue;
            }
            else
            {
                return inputString;
            }
        }
    }


    // Given a String return the number of words in the String. A word is a sequence of characters with no spaces.
    // Write this method so that the function call: int count = getWordCount("The quick brown fox jumped");
    // results in count having a value of 5. You will call this method from the main method.
    // For this assignment you may assume that words will be separated by exactly one space.
    private static int getWordCount(String input)
    {
        // Fill in the body
        int spaceCount = 0;
        for (int i = 0; i <= input.length() - 1; i++)
        {
            if (!input.contains(" "))
            {
                spaceCount = 0;
            }
            else if (input.charAt(i) == ' ')
            {
                spaceCount++;
            }
        }
        return spaceCount + 1;
    }
}
