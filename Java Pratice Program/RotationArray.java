public class RotationArray {
    public static void main(String args[])
    {
        int[] arr={4,5,6,7,8,9,1,2,3};
        System.out.println(count(arr));
        
    }
    static int count(int[] arr)
    {
        return pivot(arr)+1;
    }
    static int pivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
       
        while(start<=end)
        {
            int mid=start+(end-start)/2;
               if(mid<end && arr[mid]>arr[mid+1])
               {
                return mid;
               }
               else if(mid>start && arr[mid]<arr[mid-1])
               {
                  return mid-1;
               }
               else if(arr[mid]<=arr[start]){
                    end=mid-1;
               }
               else
               {
                start=mid+1;
               }


        }
        return -1;

        
    }
}
