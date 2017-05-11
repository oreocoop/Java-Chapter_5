import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by rcooper2 on 4/13/2017.
 *
 * Input "an object" into an Array fix.
 */
public class PushAnObjectIntoArray {

    public static List<String> push(){
         /*
         * old code:
         * List<String> items = new ArrayList<>();
         * items.add("an object");
         * return items;
         */
        List<String> items = new ArrayList<String>();
        items.add("an object");
        return items;
    }
}
