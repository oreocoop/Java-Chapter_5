/**
 * Created by rcooper2 on 4/7/2017.
 *
 * The word i18n is a common abbreviation of internationalization the developer community use instead of typing the
 * whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.
 *
 * Write a function that takes a string and turns any and all "words" (see below) within that string of length 4 or
 * greater into an abbreviation following the same rules.
 *
 * Notes:
 *
 * A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen
 * (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
 *
 * The abbreviated version of the word should have the first letter, then the number of removed characters, then the
 * last letter (eg. "elephant ride" => "e6t r2e").
 *
 * Example:

 abbreviate("elephant-rides are really fun!")
 //          ^^^^^^^^*^^^^^*^^^*^^^^^^*^^^*
 // words (^):   "elephant" "rides" "are" "really" "fun"
 //                123456     123     1     1234     1
 // ignore short words:               X              X

 // abbreviate:    "e6t"     "r3s"  "are"  "r4y"   "fun"
 // all non-word characters (*) remain in place
 //                     "-"      " "    " "     " "     "!"
 === "e6t-r3s are r4y fun!"
 */

public class WordAbbreviation {

    public static void main(String[] args){

        System.out.println(abbreviate("elephant-rides are-fun!"));
    }

    public static String abbreviate(String string) {
        String abbreviatedString = "";
        boolean isCharacter = false;
        char[] splitUpString = string.toCharArray();
//        String[]splitUpfString = string.split(" ");

//        for (int i = 0; i < splitUpString.length; i++ ){
////            if (Character.isLetter(string.charAt(i)) == true){
////                System.out.println(isCharacter);
////            }
//            isCharacter = Character.isLetter(splitUpString[i]);
//            System.out.println(isCharacter);
//            System.out.println(splitUpString[i]);
//            System.out.println();
//
//        }

        for (int i = 0; i < string.length(); i++){
            String[] eachIndividualWord = new String[0];
            for (int x = 0; i < eachIndividualWord.length; ){
                if (Character.isLetter(string.charAt(i)) == true){
                    eachIndividualWord = string.split("");
                }
            }

        }
//        System.out.println("######");
        for (int i = 0; i < string.length(); i++){

        }




//            for (int x = 0; x < string.length(); x++){
//                if (string.contains("-")){
//                    abbreviatedString = string.replace("-", " ");
//                }
//            }
        return abbreviatedString;
    }
}
