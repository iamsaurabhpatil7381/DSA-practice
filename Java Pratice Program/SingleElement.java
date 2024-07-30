public class SingleElement {

    public static void main(String[] args)
      {
        int[] arr = {1,1,2,2,3,3,4};
        int ans = 0;


      //   System.out.println(4^4);
      //   for ( int i = 0; i < arr.length; i++) {
      //     ans^=arr[i];
      //   }
      // System.out.println(ans);
          
        System.out.println(singleNonDuplicate(arr));
      }
    public  static int singleNonDuplicate(int[] arr)
     { 
        int n= arr.length;

        if(n==1)
        {
          return arr[0];
        }
        if(arr[0]!=arr[1])
        {
          return arr[0];
        }
        if(arr[n-1]!=arr[n-2])
        {
          return arr[n-1];
        }

        int start=arr[1];
        int end=arr[n-2];

        while (start<=end) {
          int mid=start+end/2;

          if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])
          {
            return mid;
          }
           if(mid%2==1 && arr[mid-1]==arr[mid] || mid%2==0 && arr[mid]==arr[mid+1])
          
          {
                 start=mid+1;
          }
          
          else{
                   end=mid-1;
          }


        }
      
        return -1;
    }


}
