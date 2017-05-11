import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by rcooper2 on 4/3/2017.
 */
public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String,Integer> bandCodes = new HashMap<>();

        //HashMap<Double,String> bandCodes2 = new HashMap<>();

        bandCodes.put("black",0);

        bandCodes.put("brown",1);
        bandCodes.put("brown",2);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a color: ");
        String colorEntered = keyboard.nextLine();



        Integer numberValue = bandCodes.get(colorEntered);





        System.out.println("You entered "+colorEntered+". That equates to a value of: "+numberValue );

        if ( numberValue == null ) {

        }
    }
}
