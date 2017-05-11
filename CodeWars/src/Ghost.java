import java.util.Random;

/**
 * Created by rcooper2 on 4/18/2017.
 *
 * Create a class Ghost
 *
 * Ghost objects are instantiated without any arguments.
 *
 * Ghost objects are given a random color attribute of white" or "yellow" or "purple" or "red" when instantiated
 *
 * Ghost ghost = new Ghost();
 * ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
 */
public class Ghost {

    // Create instance variable(s)
    private String color = "";

    // Constructor allows me to "new" an instance of Ghost.
    // The blank parenthesis means they are instantiated without any arguments.
    // The if statements set the color when I "new" an instance of ghost.
    public Ghost(){
        Random randNum = new Random();
        int minValue = 1;
        int maxValue = 4;
        int number = randNum.nextInt(maxValue-minValue+1)+minValue;

        switch(number) {
            case 1:
                this.color = "white";
                break;
            case 2:
                this.color = "yellow";
                break;
            case 3:
                this.color = "purple";
                break;
            case 4:
                this.color = "red";
                break;
        }
    }

    // Method to get the color of the ghost
    public String getColor(){
        return this.color;
    }
}
