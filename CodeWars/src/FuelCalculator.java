import java.text.DecimalFormat;
import java.text.StringCharacterIterator;

/**
 * Created by rcooper2 on 4/4/2017.
 */
public class FuelCalculator {

    public static void main(String[] args){

        System.out.println(fuelPrice(5,1.23));
        System.out.println(fuelPrice(1,5.10));
        System.out.println(fuelPrice(2,5.10));
        System.out.println(fuelPrice(3,5.10));
        System.out.println(fuelPrice(4,5.10));
    }

    public static double fuelPrice(int litres, double pricePerLiter) {
        double totalCostOfFuel = litres * pricePerLiter;
        //Double totalCostOfFuelFormatted = new Double(totalCostOfFuel);

        if (litres >=2 && litres < 4){
            totalCostOfFuel = litres * (pricePerLiter - 0.05);
        }
        else if (litres >= 4 && litres < 6){
            totalCostOfFuel = litres * (pricePerLiter - .10);
        }
        else if (litres >= 6 && litres < 8){
            totalCostOfFuel = litres * (pricePerLiter - .15);
        }
        else if (litres >= 8 && litres < 10){
            totalCostOfFuel = litres * (pricePerLiter - .20);
        }
        else if (litres >= 10){
            totalCostOfFuel = litres * (pricePerLiter - .25);
        }
        return totalCostOfFuel;
    }
}
