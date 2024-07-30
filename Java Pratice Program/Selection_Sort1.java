import java.util.*;
public class Selection_Sort1 {
    
    public static void main(String[] args)
    {
       int[]  arr={4,-2,5,7,-8};
       sort(arr);
       System.out.println(Arrays.toString(arr));
      
    }

        static void sort(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
         {
            int last=arr.length-i-1;
            int temp=max(arr,0,last);
            swap(arr,temp,last);
         }
        
        }
        static void swap(int[] arr,int first,int second)
        {
            int t=arr[first];
            arr[first]=arr[second];
            arr[second]=t;
        }
     
     static int max(int[] arr,int start,int end)
     {
        int maximum=start;
         for(int i=start;i<=end;i++)
         {
            if(arr[maximum]<arr[i])
            {
               maximum=i;
            }
         }
        return maximum;

     }
    
}
