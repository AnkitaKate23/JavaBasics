package Arrays;

//1.Write a program to print all natural numbers from 1 to n
//9. Write a program to find sum of all natural numbers between 1 to n

public class NaturalNumbers
{
    public static void main(String[] args)
    {
        int num = 15;
        int sum = 0;
        for (int i=1; i<=num; i++)
        {
            sum += i;
            System.out.println("Natural numbers from 1 to n are  " + i);
            System.out.println("Sum of the natural numbers are " +sum);
        }
    }
}
