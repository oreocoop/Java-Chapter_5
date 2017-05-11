/**
 * Created by rcooper2 on 11/30/16.
 */
public class Homework_05_WhatIsIt
{
    public static void main(String[] args)
    {
        printIt(5,3);
    }
    private static void printIt(int rows, int columns)
    {
        int i = 0;
        while (i < rows)
        {
            int j = 0;
            while (j < columns)
            {
                if ((i % 2) == (j % 2))
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print('@');
                }
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}
