/**
 * Created by rcooper2 on 4/24/2017.
 *
 * Write a method smash that takes an array of words and smashes them together into a sentence and returns the sentence.
 * You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful,
 * there shouldn't be a space at the beginning or the end of the sentence!
 *
 * Example:
 * var words = ['hello', 'world', 'this', 'is', 'great'];
 * smash(words); // returns "hello world this is great"

 * Assumptions:
 * You can assume that you are only given words.
 * You cannot assume the size of the array.
 * You can assume that you do get an array.
 *
 * What We're Testing:
 * We're testing basic loops and string manipulation. This is for beginners who are just learning loops and string
 * manipulation.
 */
public class SmashWords {

    public static void main(String[] args){
        System.out.println(smash("Hello", "world", "today"));
        System.out.println(smash(null));

    }


    public static String smash(String... words) {
        String retString = "";
        if (words == null) {
            return null;
        }

        for (int i = 0; i < words.length; i++){
            retString = retString + " " + words[i];
        }
    return retString.trim();
// Could have done:
// return words != null ? String.join(" ", words) : null;
    }
}



