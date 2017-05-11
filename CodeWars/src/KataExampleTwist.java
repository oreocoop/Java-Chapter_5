import java.util.ArrayList;

/**
 * Created by rcooper2 on 4/13/2017.
 *
 * Add the value "codewars" to the websites array 1,000 times.
 */
public class KataExampleTwist {

    public static void main(String[] args){

        System.out.println(kataExampleTwist());
    }


    public static String[] kataExampleTwist()
    {
        String[] websites = {};
        //ArrayList<String> websitesList = new ArrayList<String>();
        String[] websitesList = new String[1000];

        for (int i = 0; i < 1000; i++){
            //websitesList.add("codewars");
            websitesList[i] = "codewars";
        }
        //websites = websitesList.toArray(websites);
        return websites;
    }
}

/* another way to do it:
String[] websites = new String[1000];
Arrays.fill(websites, "codewars");
return websites;
*/

