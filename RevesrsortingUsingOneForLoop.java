package Arrays;
// Reverse order sorting by using single for loop
public class RevesrsortingUsingOneForLoop {
    public static void main(String[] args) {
        int[] arr = {12, 22, 30, 41, 15};
        int i = 0;
        int j = arr.length - 1;

        for (; i < j; i++, j--) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println("Reverse string array" + i + " is " + arr[i]);
        }

    }
}
