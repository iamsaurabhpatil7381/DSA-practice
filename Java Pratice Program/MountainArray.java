public class MountainArray {
    public static void main(String args[])
    {
        int [] arr={0,1,2,3,4,5,4,3,2};
     int ans=peakIndexMountains(arr);
     System.out.print(ans);

    }

    static int peakIndexMountains(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

      
          while(start<end)
          {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                //you are in decerasing order
                end=mid;
            }
            else{
                //you are in acesnding order

                start=mid+1;
            }
          }

          return start;

    }
    
}
