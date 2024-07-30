import java.util.*;
public class BubbleSortRecursion {
    public  static void main(String[] args)
    {
      int[] arr={4,3,2,1};
        
         
        //      sort(arr);
        //    System.out.println(Arrays.toString(arr));
          sort1(arr,arr.length-1,0);
           System.out.println(Arrays.toString(arr));
    }
    // static int[] sort(int[] arr)
    // {
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         for(int j=1;j<arr.length;j++)
    //         {
    //             if(arr[j]<arr[j]-1])
    //             {
    //                 int temp=arr[j];
    //                 arr[j]=arr[j-1];
    //                 arr[j-1]=temp;
    //             }
    //         }
           
    //     }
    //    return arr;
    // }

     static void sort1(int[] arr,int r,int c)
     {
        if(r==0)
        {
            return;
        }
        if(c < r)
        {   
            if(arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            
            sort1(arr,r,c+1);
        }
        else
        {
            sort1(arr,r-1,0);
        }
     }

}
   


