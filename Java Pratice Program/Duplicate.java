public class  Duplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2,0, 0, 4, 0, 9, 0, 6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        System.out.println("Count of zeros: " + count);
        disp(arr);
    }

    static void disp(int[] arr) {
        int nonZeroIndex = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
