//import java.util.*;
public class MissingCyclicPositive {
    public static void main(String[] args){
       int[] arr={1,3,0};

      firstPositive(arr);
      System.out.println(firstPositive(arr));
    }
    
    static int firstPositive(int[] arr)
    {
        int i=0;
        while(i<arr.length){
          int correct=arr[i]-1;
          if(arr[i]>0 && arr[i]!= arr[correct]) //condition will  ignore negetive value
          {
            swap(arr,i,correct);
          }
             else{
              i++;
             }

    }
        for(int index=0;index<=arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                return index+1;
            }
        }

        return -1;

    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
