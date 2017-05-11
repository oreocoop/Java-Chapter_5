/**
 * Created by rcooper2 on 3/31/2017.
 */
public class LeonardoDicaprioAndOscars {

    public static void main(String[] args){

        System.out.println(leo(88));
        System.out.println("The above should be: Leo finally won the oscar! Leo is happy");
        System.out.println();
        System.out.println(leo(86));
        System.out.println("The above should be: Not even for Wolf of wallstreet?!");
        System.out.println();
        System.out.println(leo(87));
        System.out.println("The above should be: When will you give Leo an Oscar?");
        System.out.println();
        System.out.println(leo(89));
        System.out.println("The above should be: Leo got one already!");
    }

    public static String leo(final int oscar)
    {
        String returnStatement;

        if (oscar == 88){
            returnStatement = "Leo finally won the oscar! Leo is happy";
        }
        else if (oscar == 86){
            returnStatement = "Not even for Wolf of wallstreet?!";
        }
        else if (oscar < 88 && oscar != 86){
            returnStatement = "When will you give Leo an Oscar?";
        }
        else {
            returnStatement = "Leo got one already!";
        }
        return returnStatement;
    }
}
