import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rcooper2 on 4/2/17.
 */
public class DecodeResistorColors {

    public static void main(String[] args) {

        System.out.println(decodeResistorColors("brown black green silver"));
    }

    public static String decodeResistorColors(String bands) {
        double resistorValue = 0;
        String returnResistorValue = "";

        String modifier = "";

        String[] resistorBands = bands.split(" ");

        String firstBand = resistorBands[0];
        String secondBand = resistorBands[1];
        String thirdBand = resistorBands[2];
        //String fourthBand = resistorBands[3];

        HashMap<String, Integer> resistorColorCodes = new HashMap<>();
        resistorColorCodes.put("black", 0);
        resistorColorCodes.put("brown", 1);
        resistorColorCodes.put("red", 2);
        resistorColorCodes.put("orange", 3);
        resistorColorCodes.put("yellow", 4);
        resistorColorCodes.put("green", 5);
        resistorColorCodes.put("blue", 6);
        resistorColorCodes.put("violet", 7);
        resistorColorCodes.put("gray", 8);
        resistorColorCodes.put("white", 9);

        resistorColorCodes.put("gold", 5);
        resistorColorCodes.put("silver", 10);

        HashMap<String,String> resistorTolerance = new HashMap<>();
        resistorTolerance.put("gold", "5%");
        resistorTolerance.put("silver", "10%");

        resistorValue = ((resistorColorCodes.get(firstBand)*10) + resistorColorCodes.get(secondBand));
        double multiplier = Math.pow(10,resistorColorCodes.get(thirdBand));
        resistorValue = resistorValue * multiplier;

        if ( resistorValue >= 1000 && resistorValue < 1000000 ){
            modifier = "k";
            resistorValue = resistorValue / 1000;
        } else if ( resistorValue >= 1000000 ) {
            modifier = "M";
            resistorValue = resistorValue / 1000000;
        }

        if ( resistorValue % 1 == 0 ) { // is there nothing (0) after the decimal
            Double dblVal = new Double(resistorValue);  // boxing it so that we can call intValue()
            returnResistorValue = Integer.toString(dblVal.intValue());
        } else {
            returnResistorValue = Double.toString(resistorValue);
        }

        if ( resistorBands.length == 3 ) { // if no 4th band, use 20% as default
            returnResistorValue = returnResistorValue + modifier + " ohms, 20%";
        } else {
            returnResistorValue = returnResistorValue + modifier + " ohms, "+ resistorTolerance.get(resistorBands[3]);
        }


        return returnResistorValue;

    }
}
