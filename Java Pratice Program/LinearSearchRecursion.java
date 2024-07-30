import java.util.*;
public class LinearSearchRecursion {
    public static void main(String[] args)
    {
       int [] arr={2,3,4,4,5,6};
       int target=4;

       System.out.println(find(arr,target,0));
       System.out.println(findIndex(arr,target,0));
      // System.out.println(findLastIndex(arr,target,arr.length-1));

       findAllIndex(arr,target,0);
       System.out.println(list);
    }

static boolean find(int[] arr,int target,int index)
    {
         
          if(index==arr.length)
          {
            return false;
          }
           
          return arr[index]==target || find(arr,target,index+1);
    }

    static int findIndex(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }

        if(arr[index]==target)
        {
            return index;
        }
        else{
            return findIndex(arr, target,index+1);
        }
    }

    static int findLastIndex(int[] arr,int target,int lastindex)
    {
        if(lastindex==-1)
        {
            return -1;
        }

        if(arr[lastindex]==target)
        {
            return lastindex;
        }
        else{
            return findIndex(arr, target,lastindex-1);
        }
    
    static ArrayList<Integer> list=new ArrayList<>();
    static void  findAllIndex(int[] arr,int target,int index)
    {
         if(index==arr.length)
         {
            return;
         }

         if(arr[index]==target)
         {
            list.add(index);
         }
         findAllIndex(arr, target, index+1);
        
    }
    
}
