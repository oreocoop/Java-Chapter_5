import java.util.Collections;

/**
 * Created by rcooper2 on 4/6/2017.
 *
 * When a minute is evenly divisible by three, the clock will say the word "Fizz".
 * When a minute is evenly divisible by five, the clock will say the word "Buzz".
 * When a minute is evenly divisible by both, the clock will say "Fizz Buzz", with two exceptions: *
 *  1. On the hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo bird will come out and "Cuckoo"
 *  between one and twelve times depending on the hour.
 *  2. On the half hour, instead of "Fizz Buzz", the clock door will open, and the cuckoo will come out and "Cuckoo"
 *  just once.
 *
 * Your input will be a string containing hour and minute values in 24-hour time, separated by a colon, and with
 * leading zeros. For example, 1:34 pm would be "13:34".
 *
 * Your return value will be a string containing the combination of Fizz, Buzz, Cuckoo, and/or tick sounds that the
 * clock needs to make at that time, separated by spaces. Note that although the input is in 24-hour time, cuckoo
 * clocks' cuckoos are in 12-hour time.
 *
 * Some examples:
 * "13:34"       "tick"
 * "21:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
 * "11:15"       "Fizz Buzz"
 * "03:03"       "Fizz"
 * "14:30"       "Cuckoo"
 * "08:55"       "Buzz"
 * "00:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
 * "12:00"       "Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo"
 */


public class FizzBuzzCuckooClock {

    public static void main(String[] args) {

        System.out.println(fizzBuzzCuckooClock("00:00"));
    }

    public static String fizzBuzzCuckooClock(String time) {
        String returnString = "tick";
        String stringHour = Character.toString(time.charAt(0)) + Character.toString(time.charAt(1));
        String stringMinute = Character.toString(time.charAt(3)) + Character.toString(time.charAt(4));
        int hour = Integer.parseInt(stringHour);
        int minute = Integer.parseInt(stringMinute);

        if (minute % 3 == 0){
            if (minute % 5 == 0){
                if (minute != 30) {
                    if (minute != 0) {
                        returnString = "Fizz Buzz";
                    }
                } else {
                    returnString = "Cuckoo";
                }
            } else {
                returnString = "Fizz";
            }
        } else if(minute %5 == 0){
            returnString = "Buzz";
        }
        if (minute == 0){
            if (hour > 12) {
                returnString = returnString.join(" ", Collections.nCopies(hour - 12, "Cuckoo"));
            } else if (hour == 0){
                returnString = returnString.join(" ", Collections.nCopies(12, "Cuckoo"));
            } else {
                returnString = returnString.join(" ", Collections.nCopies(hour, "Cuckoo"));
            }
        }
        return returnString;
    }
}
