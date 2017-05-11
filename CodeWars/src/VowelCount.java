/**
 * Created by rcooper2 on 3/31/2017.
 */
public class VowelCount {

    public static void main(String[] args){

        System.out.println(getCount("abrecidobru"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
//        for (int x = 0; x < str.length(); x++){
//            if (str.toLowerCase().charAt(x) == 'a' ||
//                    str.toLowerCase().charAt(x) == 'e' ||
//                    str.toLowerCase().charAt(x) == 'i' ||
//                    str.toLowerCase().charAt(x) == 'o' ||
//                    str.toLowerCase().charAt(x) == 'u'){
//            vowelsCount++;
//            }
//        }
        for (int x = 0; x < str.length(); x++){
            char c = str.charAt(x);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
