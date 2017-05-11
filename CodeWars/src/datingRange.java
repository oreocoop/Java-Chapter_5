/**
 * Created by rcooper2 on 4/24/2017.
 *
 * Given an integer (1 <= n <= 100) representing a person's age, return their minimum and maximum age range.
 *
 * This equation doesn't work when the age <= 14, so use this equation instead:
 * min = age - 0.10 * age
 * max = age + 0.10 * age
 */
public class datingRange {
    public static void main(String[] args){
        System.out.println(datingRange(27));
        System.out.println(datingRange(5));
        System.out.println(datingRange(17));
    }

    public static String datingRange(int age) {
        int minAge = (age / 2) + 7;
        int maxAge = (age - 7) * 2;
        double min = age - .10 * age;
        double max = age + .10 * age;
        String ageRange;

        if (age > 14) {
            ageRange = minAge + "-" + maxAge;
        } else {
            ageRange = (int) min + "-" + (int) max;
        }
        return ageRange;
    }
}
