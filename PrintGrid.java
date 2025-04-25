package Arrays;

public class PrintGrid
{
    public static void main(String[] args)
    {
        int [] [] arr = new int [10][10];
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++) {
                System.out.println("-" + arr[i][j]);
            }
            System.out.println();
        }
    }
}
