package Arrays;
// Reverse Order element sorting by using for loop
public class ArrayReverseOrderString {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp;
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array in Reverse order" + i + "is " + array[i]);
        }

    }

}

