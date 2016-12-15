/**
 * Created by rcooper2 on 12/6/16.
 */
public class ClosedLab_06
{
    public static void main(String [] args)
    {
        printMultiplicationTable();
    }
    //print a multiplication table
    private static void printMultiplicationTable()
    {
        int columnCounter = 1;
        while (columnCounter != 11){
            int rowCounter = 1;
            while (rowCounter != 11){
                System.out.print(rowCounter * columnCounter + " ");
                rowCounter++;
            }
            System.out.println();
            columnCounter++;
        }
    }
}

