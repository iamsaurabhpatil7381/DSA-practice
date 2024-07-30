import java.util.*;
public class Selection_Sort2 {
    public static void main(String [] args)
    {
       int[]  arr={-4,5,8,1,-10};
      
       sort(arr);
       System.out.println(Arrays.toString(arr));
       
    }
          
    static void sort(int[] arr)
    {

       for (int i = 0; i < arr.length; i++) {

           int last=arr.length-i-1; 
           int temp=maximum(arr,0,last);
           swap(arr,temp,last);
       }

    }
    static void swap(int[] arr,int first,int second)
    {
        int t=arr[first];
        arr[first]=arr[second];
        arr[second]=t;
    }
    static int maximum(int[] arr,int start,int end)
    {
      int max=start;
       for(int i=start;i<=end;i++)    
       {
          if(arr[max]<arr[i])
          {
            max=i;
          }

       }
      return max;
    }
    
}
