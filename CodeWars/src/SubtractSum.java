import java.util.HashMap;

/**
 * Created by rcooper2 on 4/11/2017.
 */
public class SubtractSum {

    public static void main(String[] args){

        System.out.println(subtractSum(325));
    }

    public static String subtractSum (int n) {
        String fruitResult = "";
        HashMap<Integer, String> fruitTable = populateTable();

        while (true) {
            int sum = 0;
            int difference;
            String numberToString = String.valueOf(n);
            for (int i = 0; i < numberToString.length(); i++) {
                Character c = numberToString.charAt(i); //get the character at i
                String s = c.toString(); // convert the character back into a string
                int number = Integer.parseInt(s); // convert the string into an int
//          int number = Integer.parseInt(Character.toString(numberToString.charAt(i))); // this takes the 3 lines above down to one
                sum += number; // then do add each int
            }
            difference = n - sum;
            if (fruitTable.containsKey(difference)) {
                fruitResult = fruitTable.get(difference);
                return fruitResult;
            }
            else {
                n = difference;
                continue;
            }
        }
    }

    public static HashMap<Integer, String> populateTable() {
        HashMap<Integer, String> fruitTable = new HashMap();
        fruitTable.put(1,"kiwi");
        fruitTable.put(2, "pear");
        fruitTable.put(3, "kiwi");
        fruitTable.put(4, "banana");
        fruitTable.put(5, "melon");
        fruitTable.put(6, "banana");
        fruitTable.put(7, "melon");
        fruitTable.put(8, "pineapple");
        fruitTable.put(9, "apple");
        fruitTable.put(10, "pineapple");
        fruitTable.put(11, "cucumber");
        fruitTable.put(12, "pineapple");
        fruitTable.put(13, "cucumber");
        fruitTable.put(14, "orange");
        fruitTable.put(15, "grape");
        fruitTable.put(16, "orange");
        fruitTable.put(17, "grape");
        fruitTable.put(18, "apple");
        fruitTable.put(19, "grape");
        fruitTable.put(20, "cherry");
        fruitTable.put(21, "pear");
        fruitTable.put(22, "cherry");
        fruitTable.put(23, "pear");
        fruitTable.put(24, "kiwi");
        fruitTable.put(25, "banana");
        fruitTable.put(26, "kiwi");
        fruitTable.put(27, "apple");
        fruitTable.put(28, "melon");
        fruitTable.put(29, "banana");
        fruitTable.put(30, "melon");
        fruitTable.put(31, "pineapple");
        fruitTable.put(32, "melon");
        fruitTable.put(33, "pineapple");
        fruitTable.put(34, "cucumber");
        fruitTable.put(35, "orange");
        fruitTable.put(36, "apple");
        fruitTable.put(37, "orange");
        fruitTable.put(38, "grape");
        fruitTable.put(39, "orange");
        fruitTable.put(40, "grape");
        fruitTable.put(41, "cherry");
        fruitTable.put(42, "pear");
        fruitTable.put(43, "cherry");
        fruitTable.put(44, "pear");
        fruitTable.put(45, "apple");
        fruitTable.put(46, "pear");
        fruitTable.put(47, "kiwi");
        fruitTable.put(48, "banana");
        fruitTable.put(49, "kiwi");
        fruitTable.put(50, "banana");
        fruitTable.put(51, "melon");
        fruitTable.put(52, "pineapple");
        fruitTable.put(53, "melon");
        fruitTable.put(54, "apple");
        fruitTable.put(55, "cucumber");
        fruitTable.put(56, "pineapple");
        fruitTable.put(57, "cucumber");
        fruitTable.put(58, "orange");
        fruitTable.put(59, "cucumber");
        fruitTable.put(60, "orange");
        fruitTable.put(61, "grape");
        fruitTable.put(62, "cherry");
        fruitTable.put(63, "apple");
        fruitTable.put(64, "cherry");
        fruitTable.put(65, "pear");
        fruitTable.put(66, "cherry");
        fruitTable.put(67, "pear");
        fruitTable.put(68, "kiwi");
        fruitTable.put(69, "pear");
        fruitTable.put(70, "kiwi");
        fruitTable.put(71, "banana");
        fruitTable.put(72, "apple");
        fruitTable.put(73, "banana");
        fruitTable.put(74, "melon");
        fruitTable.put(75, "pineapple");
        fruitTable.put(76, "melon");
        fruitTable.put(77, "pineapple");
        fruitTable.put(78, "cucumber");
        fruitTable.put(79, "pineapple");
        fruitTable.put(80, "cucumber");
        fruitTable.put(81, "apple");
        fruitTable.put(82, "grape");
        fruitTable.put(83, "orange");
        fruitTable.put(84, "grape");
        fruitTable.put(85, "cherry");
        fruitTable.put(86, "grape");
        fruitTable.put(87, "cherry");
        fruitTable.put(88, "pear");
        fruitTable.put(89, "cherry");
        fruitTable.put(90, "apple");
        fruitTable.put(91, "kiwi");
        fruitTable.put(92, "banana");
        fruitTable.put(93, "kiwi");
        fruitTable.put(94, "banana");
        fruitTable.put(95, "melon");
        fruitTable.put(96, "banana");
        fruitTable.put(97, "melon");
        fruitTable.put(98, "pineapple");
        fruitTable.put(99, "apple");
        fruitTable.put(100, "pineapple");
        return fruitTable;
    }
}
