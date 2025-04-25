package Arrays;

public class FindMissingArrayWithXORLogic
{
    public static void main(String[] args)
    {
        int [] array = {1, 2, 4, 5, 6};
                    //a[0], a[1], a[2], a[3], a[4]
        //Actual list is 1, 2, 3, 4, 5, 6 so the 3 number is missing in this list, so we can compare both the list and
        // check the numbers if the both the number is same will move to next number and if the numbers are different will
        // print the number that will be the missing number.
                // a[0], a[1], a[2], a[3], a[4], a[5]

        int num = 6;
        int resultValue = 0;
        for (int i = 0; i <= num; i++)
        {
            resultValue ^= i;
        }
        for (int i = 0; i < array.length; i++)
        {
            resultValue ^= array[i];
        }
        System.out.println("The missing Value is " +resultValue);
    }
}
/*
 int [] array = {1, 2, 4, 5, 6};
        int num = 6;
        int resultValue = 0;
        for (int i = 0; i <= num; i++)
        {
            resultValue ^= i;
        }
        for (int i = 0; i < array.length; i++)
        {
            resultValue ^= array[i];
        }
        System.out.println("The missing Value is " +resultValue);
 */