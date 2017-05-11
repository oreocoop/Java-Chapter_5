/**
 * Created by rcooper2 on 4/24/2017.
 *
 * Write function hexToDec which converts hex number (given as a string) to decimal number.
 */

public class hexToDecimal {
    public static void main(String[] args){
        System.out.println(hexToDec("1"));
        System.out.println(hexToDec("a"));
        System.out.println(hexToDec("10"));
        System.out.println(hexToDec("FF"));
        System.out.println(hexToDec("-C"));
    }

    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString,16);
    }
}
