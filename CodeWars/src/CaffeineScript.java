/**
 * Created by rcooper2 on 4/6/2017.
 *
 * Complete the function caffeineBuzz, which takes a non-zero integer as it's one argument.
 * If the integer is divisible by 3, return the string "Java".
 * If the integer is divisible by 3 and divisible by 4, return the string "Coffee"
 * If the integer is one of the above and is even, add "Script" to the end of the string.
 * Otherwise, return the string "mocha_missing!"
 */

public class CaffeineScript {

    public static void main(String[] args){

        System.out.println(caffeineBuzz(12));
    }

    public static String caffeineBuzz(int n){
        String stringToReturn = "mocha_missing!";

        if (n % 3 == 0 && n % 4 == 0 && n % 2 == 0) {
            stringToReturn = "CoffeeScript";
        } else if (n % 3 == 0 && n % 4 == 0) {
            stringToReturn = "Coffee";
        } else if (n % 3 == 0 && n % 2 == 0) {
            stringToReturn = "JavaScript";
        } else if (n % 3 == 0) {
            stringToReturn = "Java";
        }
        return stringToReturn;
    }
}
