/**
 * Created by rcooper2 on 4/20/2017.
 *
 * Ask a small girl - "How old are you?". She always says strange things... Lets help her!
 *
 * For correct answer program should return int from 0 to 9.
 *
 * Assume test input string always valid and may look like "1 year old" or "5 years old", etc..
 *
 * The first char is number only.
 */
public class CharProblem {

    public static void main(String[] args){

        System.out.println(howOld("5 years old"));
        System.out.println(howOld("9 years old"));
        System.out.println(howOld("1 year old"));

    }

    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }
}
