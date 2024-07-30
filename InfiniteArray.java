public class InfiniteArray {
    public static void main(String args[])
    {
      int[] arr={1,2,3,4,5,6,7,8,9,10,11,16};
      int target=16;
      System.out.println(ans(arr,target));
    
    }

    static int ans(int[] arr,int target)
    {
       int start=0;
       int end=1;

    //    while (target>arr[end]) {
    //     int temp=end+1;

    //     end=end+(end-start+1)*2;
    //   start=temp;
        
    //    }

       while (end < arr.length && target > arr[end]) {
        int temp = end + 1;
        end = end + (end - start + 1) * 2;
        start = temp;
    }

    // If end exceeds the last index, set it to the last index of the array
    if (end >= arr.length) {
        end = arr.length - 1;
    }
       return binary(arr,target,start,end);
    }


    static int binary(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
               return mid;
            }


        }
        return -1;
    }
    
}
