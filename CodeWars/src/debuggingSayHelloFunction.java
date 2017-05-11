/**
 * Created by rcooper2 on 4/24/2017.
 *
 * The starship Enterprise has run into some problem when creating a program to greet everyone as they come aboard.
 * It is your job to fix the code and get the program working again!
 *
 * Example output:
 *
 * Hello, Mr. Spock
 *
 * Original code:
 *
    function (name) {
    return 'Hello, ' name
    }
 */
public class debuggingSayHelloFunction {

    public static void main(String[] args) {
        System.out.println(sayHello("1"));
    }

    public static String sayHello(String name) {
        return "Hello, " + name;
    }
}
