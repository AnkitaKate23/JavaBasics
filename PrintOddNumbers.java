package Arrays;
//7. Write a program to print all odd numbers between 1 to 100

public class PrintOddNumbers
{
    public static void main(String[] args)
    {
        for (int i=1; i<=100; i++)
        {
            if (i % 2 != 0)
            {
                System.out.println("The odd Numbers from 0 to 100 are:   " + i);
            }
        }
    }
}
