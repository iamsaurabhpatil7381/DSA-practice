import java.util.*;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % arr.length; // Ensure k is within the bounds of the array length
        kReverse(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    static void kReverse(int[] arr, int k) {
        int n = arr.length;
             
        swap(arr, 0, k - 1);          // Reverse the first k elements
        swap(arr, k, n - 1);               // Reverse the remaining n-k elements
        swap(arr, 0, n - 1);         // Reverse the entire array  
    }

    static void swap(int[] arr, int start, int end) {
        while (start <=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
