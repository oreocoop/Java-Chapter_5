/**
 * Created by rcooper2 on 4/13/2017.
 * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
 */
public class EvenOrOdd {

    public static void main(String[] args){

        System.out.println(even_or_odd(3));
    }

    public static String even_or_odd(int number) {
        String evenOfOdd = "Odd";

        if (number % 2 == 0){
            evenOfOdd = "Even";
        }
        return evenOfOdd;
    }
}
/* could have used the Ternary Operator:
        return (number%2 == 0) ? "Even" : "Odd";
 */

