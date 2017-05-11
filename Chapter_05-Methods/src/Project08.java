import java.util.Scanner;

/**
 * Created by rcooper2 on 1/16/2017.
 *
 * A program that converts decimal numbers to Roman numerals.
 * Used to practice breaking code up into methods.
 */

public class Project08
{
    public static void main(String[] args)
    {
        Scanner inScanner = new Scanner(System.in);
        int numberToConvert;

        while (true)
        {
            numberToConvert = promptUserForNumber(inScanner);
            if (numberToConvert != 0)
            {
                System.out.println("The number " + numberToConvert + " is the Roman numeral " + convertNumberToNumeral(numberToConvert));
                System.out.println();
            }
            else
            {
                System.out.println("Goodbye!");
                break;
            }
        }
    }

    // Given a Scanner as input, prompts the user to input a number between 1 and 3999.
    // Checks to make sure the number is within range, and provides an error message until
    // the user provides a value within range.  Returns the number input by the user to the
    // calling program.
    private static int promptUserForNumber(Scanner inScanner)
    {
        int numberToConvert;
        while (true)
        {
            System.out.print("Enter a number between 1 and 3999 (0 to quit): ");
            numberToConvert = inScanner.nextInt();

            if ( numberToConvert >= 0 && numberToConvert < 4000 ) //good number
            {
                break;
            }
            else //bad number
            {
                System.out.println("ERROR! Number must be between 1 and 3999");
                System.out.println();
                continue;
            }
        }
        return numberToConvert;
    }

    // Given a number as input, converts the number to a String in Roman numeral format,
    // following the rules in the writeup for Lab 09.  Returns the String to the calling
    // program.  NOTE:  This method can possibly get long and complex.  Use the
    // convertDigitToNumeral method below to break this up and make it a bit simpler to code.
    private static String convertNumberToNumeral(int number)
    {
        String romanNumeralAppend;
        int theDigit;

        theDigit = number % 10;
        romanNumeralAppend = convertDigitToNumeral(theDigit, 'I', 'V', 'X');
        theDigit = (number / 10) % 10;
        romanNumeralAppend = convertDigitToNumeral(theDigit, 'X', 'L', 'C') + romanNumeralAppend;
        theDigit = (number / 100) % 10;
        romanNumeralAppend = convertDigitToNumeral(theDigit, 'C', 'D', 'M') + romanNumeralAppend;
        theDigit = (number / 1000) % 10;
        romanNumeralAppend = convertDigitToNumeral(theDigit, 'M', '-', '-') + romanNumeralAppend;

        return romanNumeralAppend;
    }

    // Given a digit and the Roman numerals to use for the "one", "five" and "ten" positions,
    // returns the appropriate Roman numeral for that digit.  For example, if the number to
    // convert is 49 we would call convertDigitToNumeral twice.  The first call would be:
    //     convertDigitToNumeral(9, 'I','V','X')
    // and would return a value of "IX".  The second call would be:
    //     convertDigitToNumeral(4, 'X','L','C')
    // and would return a value of "XL".  Putting those together we would see that 49 would be the
    // Roman numeral XLIX.
    // Call this method from convertNumberToNumeral above to convert an entire number into a
    // Roman numeral.
    private static String convertDigitToNumeral(int digit, char one, char five, char ten)
    {
        String digitToNumeralOnes = "";

        if (digit == 1)
        {
            digitToNumeralOnes = ""+one;
        }
        else if (digit == 2)
        {
            digitToNumeralOnes = ""+one+one;
        }
        else if (digit == 3)
        {
            digitToNumeralOnes = ""+one+one+one;
        }
        else if (digit == 4)
        {
            digitToNumeralOnes = ""+one+five;
        }
        else if (digit == 5)
        {
            digitToNumeralOnes = ""+five;
        }
        else if (digit == 6)
        {
            digitToNumeralOnes = ""+five+one;
        }
        else if (digit == 7)
        {
            digitToNumeralOnes = ""+five+one+one;
        }
        else if (digit == 8)
        {
            digitToNumeralOnes = ""+five+one+one+one;
        }
        else if (digit == 9)
        {
            digitToNumeralOnes = ""+one+ten;
        }
        return digitToNumeralOnes;
    }
}
