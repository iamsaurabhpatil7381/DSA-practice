//import java.util.*;

import java.util.Arrays;

public class MissingAndWrng {
    public static void main(String[] arg)
    {
        int[] arr={4,2,1,2};
        miss(arr);
     
      System.out.println(Arrays.toString(miss(arr)));
    }
    static int[] miss(int[] arr)
    {
        int i=0;
          while(i<arr.length)
          {
              int correct=arr[i]-1;

              if(arr[i]!= arr[correct])
              {
                swap(arr,i,correct);
              }
              else
              {
                i++;
              }
          }

    
          for(int index=0;index<arr.length;index++)
          {
            if(arr[index]!=index+1)
            {
                return new int[]{arr[index],index+1};
              // return index+1;
            }
          }
        return new int[]{-1,-1};
        // return -1;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}
