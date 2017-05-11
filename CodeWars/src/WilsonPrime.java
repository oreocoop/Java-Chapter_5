import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by rcooper2 on 4/12/2017.
 */
public class WilsonPrime {

    public static void main(String[] args){

        System.out.println(am_i_wilson(6));
    }

    public static boolean am_i_wilson(double n) {
        // Wilson Prime formula = ((P-1)! + 1) / (P * P)

        boolean wilsonPrimeResult = false;
        BigDecimal z = BigDecimal.valueOf(1);
        //BigDecimal factorial = factorialCalculation(n);
        BigDecimal factorial = new BigDecimal(factorial(new Double(n-1).longValue()));
        if (n == 0 || n == 1){
            return wilsonPrimeResult;
        }
        BigDecimal plusOne = factorial.add(z);
        BigDecimal nTimesN = BigDecimal.valueOf(n*n);
        BigDecimal divisionResult = plusOne.divide(nTimesN);
        BigDecimal remainder = divisionResult.remainder(z);
        if (( remainder.compareTo(new BigDecimal(0)) )== 0){
            wilsonPrimeResult = true;
        }
        return wilsonPrimeResult;
    }

    public static BigDecimal factorialCalculation(double number) {
        BigDecimal factorialResult=new BigDecimal(0);
        BigDecimal difference = BigDecimal.valueOf(number-1);
        BigDecimal y = BigDecimal.valueOf(1);
        for (BigDecimal i = difference.subtract(y); i.compareTo(BigDecimal.ZERO) > 0; i.subtract(y)) {
            factorialResult = difference.multiply(i);
            difference = factorialResult;
        }
        return factorialResult;
    }


    public static long factorial(long number) {
        if (number <= 1) return 1;
        else return number * factorial(number - 1);
    }
}
