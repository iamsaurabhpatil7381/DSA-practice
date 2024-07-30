

import java.util.*;


public class Selection_Sort {
    public static void main(String args[])
    {
         int[] arr={2,3,-4,5,-6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        // System.out.println(Arrays.toString(arr));
        
    }

    static void sort(int[] arr)
    {
          for (int i = 0; i < arr.length; i++) {
              int last=arr.length-i-1;

               int maximum=max(arr, 0, last);
                swap(arr, maximum,last);
          }
    }
    static  void swap(int[] arr,int first,int second)
    {
        int t=arr[first];
        arr[first]=arr[second];
        arr[second]=t;
    }
    static int max(int[] arr,int start,int end)
     {  
        int temp=start;
       
        for (int i = start; i <=end; i++) {
         
            if (arr[temp]<arr[i]) {
                temp=i;
                
                
            }
        
       
     }
     return temp;
}

}
      
