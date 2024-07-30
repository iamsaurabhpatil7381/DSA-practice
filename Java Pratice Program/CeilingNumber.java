public class CeilingNumber {
    public static void main(String args[])
    {
       int arr[]={2,3,5,8,14,16,18};
       int target=55;

       int ans=ceiling(arr,target);

       System.out.println(ans);

    }

    static int ceiling(int arr[],int target)
    {
     int start=0;
     int end=arr.length-1;

     //find number smallest or greater than target;
     
        while(start<=end)
        {
            int mid=(start+end)/2;

            if(target>arr.length-1){
                return -1;
            }
             if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
         
            }
          
        }
        return start;
     
        
    }
    
}
