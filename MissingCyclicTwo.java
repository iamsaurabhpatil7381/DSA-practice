import java.util.*;
public class MissingCyclicTwo {
    public static void main(String[] args)
    {
        int[] arr={3,2,4,1,3,2,7,8};
    
        System.out.println(missing (arr));
    }
 
     static List<Integer>missing (int[] arr)
     {
        int i=0;
         while(i<arr.length)
         {
            int correct=arr[i]-1;
             
              if(arr[i]<arr.length && arr[i] != arr[correct])
              {
                swap(arr,i,correct);
              }
              else
              {
                i++;
              }
         }
         List<Integer> ans=new ArrayList<>();
         for(int index=0;index<arr.length;index++)
         {
            if(arr[index]!= index+1)
            {
                ans.add(index+1);
            }
            
         }
         return ans;
     }
    
      static void swap(int[] arr,int first,int second)
      {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
      }

    }
  
