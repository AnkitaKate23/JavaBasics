package Arrays;

public class ArrayDescendingOrderByUsingBubbleSortLogic
{
    public static void main(String[] args)
    {
        int [] arr ={7, 8, 3, 1, 2};

        //Using Bubble sort technique in this program
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length-i-1; j++)
            {
                if(arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println("The Descending order array " + i + "is " + arr[i]);
        }
    }

}
