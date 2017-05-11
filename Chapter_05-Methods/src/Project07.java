/**
 * A program that plays the dice game high/low
 * Used to practice breaking code up into methods.
 *
 * Created by rcooper2 on 1/5/2017.
 */

import java.util.Scanner;

public class Project07
{
    public static void main(String[] args)
    {
        // Fill in the body
        Scanner in = new Scanner(System.in);
        int currentPool = 100; // initial money given to player
        int currentBet = 1;

        while (currentBet > 0)
        {
            if (currentBet == 0)
            {
                System.out.println("You have " + currentBet + " left");
                System.out.println("Goodbye!");
            }

            currentBet = getBet(in, currentPool);
            System.out.println("You bet " + currentBet + " dollars.");

            // play the game
            //roll dice/
            // calculate winnings

        }

        // They're done playing here
    }

    // Given a Scanner and a current maximum amount of money, prompt the user for
    // an integer representing the number of dollars that they want to bet.  This
    // number must be between 0 and to maximum number of dollars.  If the user enters
    // a number that is out of bounds, display an error message and ask again.
    // Return the bet to the calling program.
    private static int getBet(Scanner inScanner, int currentPool)
    {
        int bet = -1;
        while ( bet < 0 || bet > currentPool )
        {
            System.out.print("Enter an amount to bet (0 to quit): ");
            bet = inScanner.nextInt();
            String junk = inScanner.nextLine(); // Needed to clear the CR from the end of the read buffer
            if ( bet < 0 || bet > currentPool )
            {
                System.out.println("Your bet MUST be between 0 and " + currentPool + " dollars");
            }
        }
        return bet;
    }

    // Given a Scanner, prompt the user for a single character indicating whether they
    // would like to bet High ('H'), Low ('L') or Sevens ('S').  Your code should accept
    // either capital or lowercase answers, but should display an error if the user attempts
    // to enter anything but one of these 3 values and prompt for a valid answer.
    // Return the character to the calling program.
    private static char getHighLow(Scanner inScanner) {
        // Fill in the body

        return 'H';
    }

    // Produce a random roll of a single six-sided die and return that value to the calling
    // program
    private static int getRoll() {
        // Fill in the body

        return 0;
    }

    // Given the choice of high, low or sevens, the player's bet and the total result of
    // the roll of the dice, determine how much the player has won.  If the player loses
    // the bet then winnings should be negative.  If the player wins, the winnings should
    // be equal to the bet if the choice is High or Low and 4 times the bet if the choice
    // was Sevens.  Return the winnings to the calling program.
    private static int determineWinnings(char highLow, int bet, int roll) {
        // Fill in the body

        return 0;
    }
}
