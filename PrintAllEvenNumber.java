package Arrays;
// 7. Write a program to print all even numbers between 1 to 100
//10. Write a program to find sum of all even numbers between 1 to 100
public class PrintAllEvenNumber
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i=1; i<=100; i++)
        {
            if (i % 2 == 0)
            {
                sum += i;
                System.out.println("Even Numbers between 1 to 100 are :  " +i);
                System.out.println("Sum of Even numbers " +sum);
            }
        }
    }
}
