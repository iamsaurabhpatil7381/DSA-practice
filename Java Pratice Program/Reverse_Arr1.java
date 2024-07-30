import java.util.*;
import java.io.*;
public class Reverse_Arr1 {
    public static void main(String[] args) 
    {
          int[] arr={9,1,2,3,4,5};
         reverse(arr);
         
          //reverse1(arr);
         System.out.println(minMax(arr));
         System.out.println(min(arr));
    }

    static int minMax(int[] arr)
    {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
    static int min(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    
    static void reverse(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
         
         while(start<end)
         {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
         }
         System.out.println(Arrays.toString(arr));

    }


    // static void reverse1(int[] arr)
    // { 
    //     int[] reversedArr = new int[arr.length];
    //     for (int i = 0; i < arr.length; i++) {
    //         reversedArr[i] = arr[arr.length - i - 1];
    //     }

    //     // Print reversed array
    //     System.out.print("Reversed Array: ");
    //     for (int i : reversedArr) {
    //         System.out.print(i + " ");

    //     }
    // }
}


