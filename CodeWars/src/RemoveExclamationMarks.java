/**
 * Created by rcooper2 on 3/31/2017.
 */
public class RemoveExclamationMarks {

    public static void main(String[] args){

        System.out.println(removeExclamationMarks("Hello World!"));
    }
    static String removeExclamationMarks(String s){

        String stringWithoutExclamationMarks = "";

        for (int x = 0; x < s.length(); x++){

            if (s.charAt(x) != '!'){
                stringWithoutExclamationMarks = stringWithoutExclamationMarks + Character.toString(s.charAt(x));
            }
        }
        return stringWithoutExclamationMarks;
    }
}
