import java.util.*;
public class Swap {
    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

         swap_a(arr,0,3);
         System.out.println(Arrays.toString(arr));
    }

    static void swap_a(int arr[],int index0,int index1)
    {
        int temp=arr[0];
        arr[0]=arr[3];
        arr[3]=temp;
    }
    
}
