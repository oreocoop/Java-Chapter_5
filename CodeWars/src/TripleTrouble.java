/**
 * Created by rcooper2 on 4/20/2017.
 *
 * Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
 * Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter,
 * see example below!
 *
 * Ex) Input: "aa", "bb" , "cc" => Output: "abcabc"
 *
 * Note: You can expect all of the inputs to be the same length.
 */
public class TripleTrouble {

    public static void main(String[] args){

        System.out.println(tripleTrouble("aa", "bb", "cc"));
        System.out.println(tripleTrouble("this", "test", "lock"));
    }

    public static String tripleTrouble(String one, String two, String three) {
        String retValue = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < one.length(); i++){
            sb.append(one.valueOf(one.charAt(i))+two.valueOf(two.charAt(i))+three.valueOf(three.charAt(i)));
            retValue = sb.toString();
        }
    return retValue;
    }
}
