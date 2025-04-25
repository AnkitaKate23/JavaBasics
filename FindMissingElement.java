package Arrays;

public class FindMissingElement
{
    public static void main(String[] args)
    {
        int [] array = {1, 3, 4, 5, 6};
        int n = 6;
        int sumN = (n * (n+1)) / 2;
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        int missValue = sumN - sum;
        System.out.println("The Missing value " + missValue);
    }

}
