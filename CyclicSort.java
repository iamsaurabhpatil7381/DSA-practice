import java.util.*;
public class CyclicSort {
    public static void main(String args[])
    {
       //int arr[]={4,5,2,3,1}; //CyclicSort is been working only with n>=1;
       int arr[]={8,6,7,1,2,3,4,5};
       sort(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr)
    {
        // for(int i=0;i<arr.length;)9
        // {
        //    swap(arr,i,arr[i]-1);
        //    i++;

        // }

          int i=0;
          while(i<arr.length)
          {
            int check=arr[i]-1;
             if(arr[check] != arr[i])
             {
                swap(arr,check,i);
                
             }
             else
             {
                i++;
             }
          }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
      
    }

    
}
