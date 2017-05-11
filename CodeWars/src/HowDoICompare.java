/**
 * Created by rcooper2 on 4/20/2017.
 *
 * What could be easier than comparing integer numbers? However, the given piece of code doesn't recognize some of the
 * special numbers for a reason to be found. Your task is to find the bug and eliminate it.
 *
 public static String whatIs(Integer x) {
    for (Object[] p : specialNumbers) {
        if (p[0] == x)
    return (String)p[1];
    }
    return "nothing";
 }

 static final Object[][] specialNumbers = {
    {42, "everything"},
    {42 * 42, "everything squared"},
 };

 */
public class HowDoICompare {

    public static void main(String[] args){

        System.out.println(whatIs(7));
        System.out.println(whatIs(422));
        System.out.println(whatIs(1764));
    }

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            //if (Integer.compare((Integer)p[0],x) == 0) {
            if (x.equals(p[0])) {
                return (String) p[1];
            }
        }

//        Below is what the enhanced for loop above is really doing:
//        for (int y=0;y<specialNumbers.length;y++) {
//            if (specialNumbers[y][0].equals(y)) {
//                return (String)specialNumbers[y][1];
//            }
//        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {422, "everything"},
            {1764, "everything squared"},
    };
}
