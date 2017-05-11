public class SequenceSum{

    public static void main(String args[]){

        int param = 6;
        String whatIgotBack = SequenceSum.showSequence(param);

        System.out.println(whatIgotBack);
    }




    public static String showSequence(int value){

        int current = 0;
        String returnValue="";
        int sumOfNumbers = 0;

        if (value < 0){
            return value + "<0";
        }

        else if (value == 0){
            return value + "=0";
        }

        for (int x = 0; x <= value; x++){
            returnValue = returnValue + current + "+";
            sumOfNumbers = sumOfNumbers + current;
            current++;
        }

        returnValue = returnValue.substring(0, returnValue.length()-1);
        returnValue = returnValue + " = " + sumOfNumbers;

        return returnValue;
    }
}