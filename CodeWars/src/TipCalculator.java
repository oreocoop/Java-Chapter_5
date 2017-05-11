import java.util.HashMap;

/**
 * Created by rcooper2 on 4/28/2017.
 */
public class TipCalculator {

    public static void main(String[] args){
        System.out.println(calculateTip(107.65, "great"));
    }

    public static Integer calculateTip(double amount, String rating){
        HashMap<String, Double> tipRatingMap = new HashMap<String, Double>();

        tipRatingMap.put("terrible", 0.0);
        tipRatingMap.put("poor", .05);
        tipRatingMap.put("good", .10);
        tipRatingMap.put("great", .15);
        tipRatingMap.put("excellent", .20);

        if ( !tipRatingMap.containsKey(rating.toLowerCase()) ) {
            return null;
        }

        double amtOfTip = amount * tipRatingMap.get(rating.toLowerCase());

        return new Double(Math.ceil(amtOfTip)).intValue();
    }
}
