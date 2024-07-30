import java.util.*;
public class QuickSort {
    public static void main(String[] args)
    {
      
    int [] arr={5,4,3,2,1};
      sort(arr,0,arr.length-1);
      System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr,int low,int hi)
    {
         if(low>=hi)
         {
            return;
         }   //base condition

         int s=low;
         int e=hi;
         int m=s+(e-s)/2;
         int pivot=arr[m];

         while(s<=e)
         {
            while(arr[s]<arr[pivot])
            {
                s++;
            }
            while(arr[e]>arr[pivot])
            {
                e--;
            }

            if(s<=e)
            {
                int temp= arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
         }
         sort(arr, low,e);
         sort(arr,s,hi);
    }
    
}
