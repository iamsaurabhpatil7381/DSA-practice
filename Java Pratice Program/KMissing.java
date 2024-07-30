public class KMissing {
    public  static void main(String[] args)
    {
     int[]   arr = {2,3,4,7,11};
     System.out.println(missNo(arr));

    }
    //  static int findKthPositive(int[] arr, int k) 
    //  {
    //     int start=0;
    //     int end=arr.length-1;

    //     while(start<=end)
    //     {
    //         int mid=start+(end-start)/2;

    //         if()
    //     }
        
    // }
    static int missNo(int[] arr)
    {
        int i=0;
       while(i<=1000 )
       {
          if(i!=arr[i])
          {
            return i;
            
          }
          i++;
       }
       return -1;
    }
}
