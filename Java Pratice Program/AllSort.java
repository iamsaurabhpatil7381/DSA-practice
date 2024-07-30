import java.util.*;
public class AllSort {
    public static void main(String[] args){
        int[] arr={5,8,9,10,-1};
        firstPositive(arr);
      System.out.println(Arrays.toString(arr));
      // System.out.println(Arrays.toString(firstPositive(arr)));
     }
     
     static void firstPositive(int[] arr)
     {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
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
