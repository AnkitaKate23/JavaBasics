package Arrays;

public class FindMissingElementUsingDiff {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        int num = 6;
        int expected = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != expected) {
                System.out.println("The Missing Value is " + expected);
                return;
            }
            expected++;
        }
    }
}