public class BinarySearchRecursion {
    public static void main(String[] args)
    {
          int[] arr={4,5,6,8,99,100,233};
          int target=101;
       System.out.println( bSearch(arr, target, 0, arr.length-1));

    }
    static int bSearch(int[] arr,int target,int start,int end)
    {

           if(start>end)
           {
              return -1;
           }

        int mid=start+(end-start)/2;
          
           if(arr[mid]<target)
           {
             return bSearch( arr, target, mid+1, end);
           }
           if(arr[mid]>target)
           {
            return bSearch( arr, target, start, mid-1);
           }

           return mid;
           
    }
    
}
