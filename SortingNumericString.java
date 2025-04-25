package Arrays;

public class SortingNumericString
{
    public static void main(String[] args)
    {
        int [] array1 = {1, 2, 3, 4, 5};
        String [] array2 = {"Java, SQL, HTML, Python"};
        for (int i = 0; i < array1.length-1; i++)
        {
            for (int j = 0; j < array1.length-1-i; j++)
            {
                System.out.println("Sort the string array similarly" + array2[i]);

                if (array1[j] > array1[j+1])
                {
                    int temp = array1[j];
                    array1[j] = array1[j+1];
                    array1[j+1] = temp;
                }
            }
            for (i = 0; i < array1.length; i++){
                System.out.println("Sorted Numeric array ara " + array1[i]);
            }

        }

    }
}
