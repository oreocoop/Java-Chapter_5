/**
 * Created by rcooper2 on 11/30/16.
 */
public class Homework_05_AnEnigmaticProgram
{
    public static void main(String[] args)
    {
        String s = enigma("0123456789");
        System.out.println(s);
    }

    private static  String enigma(String str)
    {
        int i = 0;
        String result = "";
        while (i < str.length())
        {
            int j = (i + 3) % str.length();
            result = result + str.charAt(j);
            i = i + 1;
        }
        return result;
    }
}
