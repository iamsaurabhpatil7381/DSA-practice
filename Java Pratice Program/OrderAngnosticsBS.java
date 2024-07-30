public class OrderAngnosticsBS {


    public static void main(String args[])
    {

        //int arr[]={1,2,3,45,66,100,121,125};

        int arr[]={100,90,75,66,50,12,-125};

        int target=0;//-125;


        System.out.println( binary( arr, target));

    
}
    

     static int binary(int arr[],int target)
     {
        int start=0;
        int end=arr.length-1;


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




