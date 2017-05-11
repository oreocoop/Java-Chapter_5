/**
 * Created by rcooper2 on 3/1/2017.
 */
public class SelfChecks {

    private int x = 0;
    private int y = 8;

    public static void main(String[] args){
        //1. Is the method call "Hello, World".println() legal? Why or why not?

        //I would say no because it doesn't include System.out
        //Actual Answer: No-the object "Hello, World" belongs to the String class, and the String class has no println
        //method.
        //"Hello World".println();

        //2. When using a String object, you do not know how it stores its characters. How can you access them?

        //By looking it up through the public interface, the Java Docs.
        //Actual Answer: Through the substring and charAt methods.

        //3. Describe a way in which a String object might store it's characters.

        //In encapsulation? In methods?
        //Actual Answer: As an ArrayList<Character>. As a char array.

        //4. Suppose the providers of your Java compiler decide to change the way that a String object stores it's
        //characters, and they update the String method implementations accordingly. Which parts of your code do you
        //need to change when you get the new compiler?

        //The parts that use the methods on String.
        //Actual Answer: None. THe methods will have the same effect, and your code could not have manipulated String
        // objects in any other way.

        //5. Supply the body of a method public void reset() that resets the counter back to zero.

        //public void reset(){
        //value = 0;
        //}



    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
