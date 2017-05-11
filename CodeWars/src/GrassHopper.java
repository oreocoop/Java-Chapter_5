import java.util.DoubleSummaryStatistics;

/**
 * Created by rcooper2 on 4/17/2017.
 *
 * Your friend is traveling abroad to the United States so he wrote a program to convert fahrenheit to celsius.
 * Unfortunately his code has some bugs.
 *
 * Find the errors in the code to get the celsius converter working properly.
 *
 * To convert fahrenheit to celsius:
 * celsius = (fahrenheit - 32) * (5/9)
 */
public class GrassHopper {

    public static String weatherInfo(int temp) {
        int c = (int) (convertToCelsius(temp));
        if (c > 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = (temperature) - 32 + (5/9.0);
        return celsius;
    }
}
