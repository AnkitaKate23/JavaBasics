package Arrays;
// Reverse order string using for loop where the change is in the if condition only
public class ArrayReverseOrderWithDifferentLogic
{
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                int temp;
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("The Revere Order String is " + i + "is " + arr[i]);
        }
    }
}
