import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 Created by rcooper2 on 3/30/2017.

 You are given an odd-length array of integers, in which all of them are the same, except for one single number.
 Implement the method stray which accepts such array, and returns that single different number.
 The input array will always be valid! (odd-length >= 3)

 Examples:
 [1,1,2] => 2
 [17, 17, 3, 17, 17, 17, 17] => 3
 */

class Solution {

    public static void main(String args[]) {

        int[] paramForStray = {1,2,1};

        for (int x = 0; x < paramForStray.length; x++){
            System.out.println("This is my Array " + paramForStray[x]);
        }
        System.out.println();
        System.out.println("This is my Array being called from my method " + stray(paramForStray));

    }

    static int stray (int[] numbers){

        int nonStray = numbers[0];
        int possibleNonStray = 0;
        if (numbers[0] == numbers[numbers.length-1]) { // first and last are the same
            possibleNonStray = numbers[0];
            if (possibleNonStray == numbers[1]) {
                nonStray = numbers[0];
            }
        }
        else {
            if (numbers[1] == numbers[numbers.length-1]) {
                possibleNonStray = numbers[1];
                if (possibleNonStray == numbers[2]) {
                    nonStray = numbers[2];
                }
            }
            else {
                nonStray = numbers[1];
            }
        }

        int stray = 0;
        for (int x=0;x<numbers.length;x++) {
            if ( numbers[x] != nonStray) {
                stray = numbers[x];
            }
        }
        return stray;
    }
}