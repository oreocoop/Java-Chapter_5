/**
 * Created by rcooper2 on 12/12/2016.
 *
 * This program checks to see if a UPC string is a valid UPC code.
 *
 * The standard for one type of UPC (known as UPC-A) says that a valid UPC must be encoded as a 12 digit string where
 * the first 11 digits form the unique code and the final digit is used as a "check digit" to ensure that the UPC has
 * been correctly read by the scanner. If the UPC has been correctly read, then the application of a specific algorithm
 * to the first 11 digits of the UPC should give a result equal to the check digit.
 *
 * Steps:
 * Prompt the user to enter a string of numbers as a UPC code, or enter a blank line to quit the program.
 * If user doesn't quit, your program should ensure that this string is exactly 12 characters in length.
 * If user doesn't enter 12 characters in length, program should print an error message asking for a valid string.
 * Program should use the algorithm below to compute what the check digit should be:
 *
 * 1. From left to right, add the digits in the odd-numbered positions (starting the count from 1) and multiply the result by 3.
 * 2. From left to right, add the digits in the even-numbered positions to the total computed in step 1
 * 3. Take the result from step 2 and compute the remainder when divided by 10 (result modulo 10).
 * 4. If the remainder is not zero, subtract this remainder from 10 to get the check digit.
 * 5. If the remainder is zero, then the check digit should be 0.
 *
 * Compare answer to the actual value in the provided string and report whether the UPC is valid or wrong.
 * If wrong, program should report what the correct check digit should be for the input UPC.
 * Program should keep asking for new UPC until the user enters a blank line to quit the program.
 */
import java.util.Scanner;

public class Project06
{
    public static void main(String[] args)
    {
        String upcEntry = "";
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter a UPC (enter a blank line to quit): ");
            upcEntry = in.nextLine();

            if (upcEntry.equals(""))
            {
                System.out.println("Goodbye!");
                break;
            }
            else if ( upcEntry.length() !=12 )
            {
                System.out.println("ERROR! UPC MUST have exactly 12 digits");
                System.out.println();
                continue;
            }
            int oddComputation = getOddComputation(upcEntry);
            int evenComputation = getEvenComputation(upcEntry);

            System.out.println("Check digit should be: " + getComputedCheckDigit(oddComputation, evenComputation));

            char getLastChar = upcEntry.charAt(upcEntry.length() - 1); //gets the last character of the UPC
            int checkDigit = Character.getNumericValue(getLastChar); //converts the last character of the UPC into an int
            System.out.println("Check digit is: " + checkDigit); //prints out the int

            //compares the check digit to the computed check digit to see if they match.
            //if they match, print valid; else, print invalid.
            if (checkDigit == getComputedCheckDigit(oddComputation, evenComputation))
            {
                System.out.println("UPC is valid");
            }
            else
            {
                System.out.println("UPC is not valid");
            }
            System.out.println();
        }
    }


    public static int getOddComputation(String upcEntry)
    {
        int oddComputation = 0;
        for (int i = 0; i < upcEntry.length(); i = i + 2 )
        {
            oddComputation = oddComputation + Character.getNumericValue(upcEntry.charAt(i));
            //System.out.print(upcEntry.charAt(i));
        }
        return oddComputation * 3;
    }

    public static int getEvenComputation(String upcEntry)
    {
        int evenComputation = 0;
        for (int i = 1; i < upcEntry.length() - 1; i = i + 2 )
        {
            evenComputation = evenComputation + Character.getNumericValue(upcEntry.charAt(i));
            //System.out.print(upcEntry.charAt(i));
        }
        return evenComputation;
    }

    public static int getComputedCheckDigit(int oddComputation, int evenComputation)
    {
        int computedCheckDigit;
        int modulo10 = (oddComputation + evenComputation) % 10;
        if (modulo10 == 0)
        {
            computedCheckDigit = 0;
        }
        else
        {
            computedCheckDigit = 10 - modulo10;
        }
        return computedCheckDigit;
    }
}