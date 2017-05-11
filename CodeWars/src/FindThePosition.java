/**
 * Created by rcooper2 on 4/17/2017.
 */
public class FindThePosition {

    public static void main(String[] args){
        System.out.println(position('A'));
    }

    public static String position(char alphabet)
    {
        String positionOfCharacterInAlphabet;
        char ch = Character.toUpperCase(alphabet);
        positionOfCharacterInAlphabet = Integer.toString((ch - 'A') + 1);
        return "Position of alphabet: " + positionOfCharacterInAlphabet;
    }
}
