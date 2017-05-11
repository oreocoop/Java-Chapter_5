/**
 * Created by rcooper2 on 4/13/2017.
 *
 * Create a function which answers the question "Are you playing Banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing Banjo!
 *
 * The function takes a name as its only argument, and returns one of the following strings:
 * C# name + "plays banjo" name + "does not play banjo"
 *
 * Names given are always valid strings.
 */
public class Banjo {

    public static void main(String[] args){

        System.out.println(areYouPlayingBanjo("Brian"));
    }

    public static String areYouPlayingBanjo(String name) {
        String playsBanjo = " plays banjo";
        String doesNotPlayBanjo = " does not play banjo";
        String retVal;

        if (Character.toString(name.charAt(0)).equals("R") || Character.toString(name.charAt(0)).equals("r")){
            retVal = playsBanjo;
        } else {
            retVal = doesNotPlayBanjo;
        }
        return name + retVal;
    }
}
/* could have used .startsWith method on String:

if( name.toUpperCase().startsWith("R") )
   return name + " plays banjo";
else
   return name + " does not play banjo";
 */

