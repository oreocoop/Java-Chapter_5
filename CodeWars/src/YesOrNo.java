/**
 * Created by rcooper2 on 4/13/2017.
 */
public class YesOrNo {

    public static void main(String[] args){

        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b) {

        String yesOrNo = "Yes";
        if (b == true){
            return yesOrNo;
        } else {
            yesOrNo = "No";
        }
        return yesOrNo;
    }
}
/*
could have done:
return b ? "Yes" : "No";
This means, if b is true, return Yes otherwise return No. The ? takes three things.
 */
