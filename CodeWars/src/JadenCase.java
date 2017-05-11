import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;


/**
 * Created by rcooper2 on 4/5/2017.
 *
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known
 * for almost always capitalizing every word.
 *
 * Your task is to convert strings to how they would be written by Jaden Smith. The strings are actual quotes from
 * Jaden Smith, but they are not capitalized in the same way he originally typed them.
 *
 * Example:
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 *
 * Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase.equals("")){
            return null;
        }

        String newCapitalizedString = "";
        String[] s = phrase.split(" ");
        char firstCharacter;

            for (int x = 0; x < s.length; x++){

                //get the first character out of the first string in the array
                firstCharacter = s[x].charAt(0);

                //change the character to an uppercase
                firstCharacter = Character.toUpperCase(firstCharacter);

                //replace the first character of the first string in the array
                s[x] = s[x].replace(s[x].charAt(0),firstCharacter);

                newCapitalizedString += s[x] + " ";
            }
        return newCapitalizedString.trim();
    }
}

