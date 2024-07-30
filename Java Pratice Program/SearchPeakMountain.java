public class SearchPeakMountain {
    
    public static void main(String args[])
    {
        int[] arr={1,2,3,14,15,4,3,2,1};
        int target=4;
        int ans=search(arr,target);
        System.out.println(ans);

    }
       static int search(int[] arr,int target){

        int peak=peakIndexMountains(arr);
        int firstTry= binary(arr, target,0,peak);
        if(firstTry !=-1)
        {
            return firstTry;
        }
        return binary(arr,target,peak+1,arr.length-1);


       
    }

public static int peakIndexMountains(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
          int mid=start+(end-start)/2;

          if(arr[mid]>arr[mid+1])
          {
            end=mid;

          }
          else{
            start=mid+1;
          }
     


        }
        return end;
    }
    static int binary(int arr[],int target,int start,int end)
     {
       


        boolean isAsc;
        if(arr[start]<arr[end])
        {
             isAsc=true;
        }
          else{
            isAsc =false;
          }

        while(start<=end)
        {
        int mid=(start+end)/2;

        if(target==arr[mid])
        {
            return mid;
        }
         if(isAsc){
           if(target>arr[mid])
           {
            start=mid+1;
           }
           else if(target<arr[mid])
           {
            end=mid-1;

           }
        }
         else {
            if(target<arr[mid])
            {
             start=mid+1;
            }
            else if(target>arr[mid])
            {
             end=mid-1;
 
            }
         }
 
          

        }
         return -1;

     }


}
