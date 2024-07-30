public class LinearSearch {
    public static void main(String args[])
    {

        int nums[]={1,3,2,4,6,9,7};
        int target=100;

     
     int ans=mearch(nums,target);
    // boolean ans=mearch(nums,target);
     
      System.out.println(ans);



    }
    static int mearch(int[] arr,int target)
    {
       
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            if(element==target)
            {
                return i;
            }
           
         }

         return -1;
    }

    // static boolean mearch(int[] arr,int target)
    // {
       
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         int element=arr[i];
    //         if(element==target)
    //         {
    //             return true;
    //         }
           
    //      }

    //      return false;
    // }
}

