/**
 * Created by rcooper2 on 4/13/2017.
 */
public class Swapper {

    // This is creating a new Object array called arguments.
    public Object[] instanceListOfThings;
    public String firstName = "";

    // This is a constructor. It allows me to 'new' a Swapper object in another program.
    // It takes an Object array called args as a parameter.
    // In the constructor, it sets the arguments Object array to args, the parameter that it is given.
    public Swapper(final Object[] locallistofthings){
        instanceListOfThings=locallistofthings;
        this.firstName = "dfjg";
    }

    // This is a method called swapValues that does not take any parameters.
    // In this method, a new Object array is created named args. It takes to parameters, arguments [0] and [1].
    // A temporary Object array is also created called temp and it is initialized to args[0].
    // Then args[0] is set to args[1].
    // Then args[1] is set to the temp element, which is args[0]
    public void swapValues() {
//        Object[] args = new Object[]{instanceListOfThings[0],instanceListOfThings[1]};
//        Object temp = args[0];
//        args[0] = args[1];
//        args[1] = temp;
//        this.instanceListOfThings = args;

        Object temp = instanceListOfThings[0];
        instanceListOfThings[0] = instanceListOfThings[1];
        instanceListOfThings[1] = temp;
    }









    public static void main(String[] arguments){

        System.out.println(/*swapValues()*/);

        Integer[] nums = new Integer[]{1,2};

        Swapper r= new Swapper(nums);
        r.swapValues();

        System.out.println("r.arguments[0]==="+r.instanceListOfThings[0]);
        System.out.println("r.arguments[1]==="+r.instanceListOfThings[1]);
    }



}
