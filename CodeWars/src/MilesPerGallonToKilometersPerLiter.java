import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by rcooper2 on 4/4/2017.
 * Create an application that will display the number of kilometers per liter (output) based on the number of miles
 * per imperial gallon (input).
 *
 * Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded off
 * without the 0. So instead of 5.50, we should get 5.5.
 */

public class MilesPerGallonToKilometersPerLiter {

    public static void main(String[] args){

        System.out.println(mpgToKPM(10));
    }

    public static float mpgToKPM(final float mpg) {
        float kilometersPerLiter;
        float gallonToLiterConversion = 4.54609188f; //1 Imperial Gallon = 4.54609188 litres
        float mileToKilometerConversion = 1.609344f; //1 Mile = 1.609344 kilometres

        kilometersPerLiter = (mileToKilometerConversion * mpg) / gallonToLiterConversion;

        return roundOffTo2DecPlaces(kilometersPerLiter);

    }
    public static float roundOffTo2DecPlaces(float val)
    {
        //Create a new BigDecimal (BigDecimal is immutable - cannot be changed)
        BigDecimal bd = new BigDecimal(val);

        //Takes the original BigDecimal and makes a new one, rounded and 2 decimal places.
        BigDecimal roundedBD = bd.setScale(2,BigDecimal.ROUND_HALF_UP);

        return roundedBD.floatValue();
    }
}
