/**
 * Created by rcooper2 on 4/17/2017.
 *
 * Vasya Pupkin just started learning Java and C#. At first, he decided to write simple program that was supposed
 * to sum up two small numbers (numbers and their sum fit in a byte), but it didn't work. Vasya was too sad to find
 * out what is wrong. Help him to correct the mistake.
 */
public class FirstClass {


    public static byte sum (byte a, byte b) {

//        original code:
//        byte c = (a + b);
//        return c;

        int i = (a + b);
        String str = Integer.toString(i);
        byte c = Byte.valueOf(str);
        return c;
    }
}
