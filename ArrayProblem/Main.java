import java.util.*;;

public class Main {
    public static void main(String args[])
    {
       int[] arr={9,5,5,1,9,4,6,2,4,1,6};

          int ans=0;
        //   Arrays.sort(arr);
        //   System.out.println(Arrays.toString(arr));
        //   for (int i = 0; i < arr.length; i++) {
        //      if(i%2==0)
        //      {
        //         ans=ans+arr[i];
        //      }
        //      else{
        //         ans-=arr[i];
        //      }
        //   }
        //    System.out.println(ans);
          // int result=arr[0];
          int max=arr[0];
          int temp=0;
          for (int i = 0; i < arr.length; i++) {
               ans^=arr[i];
               if(arr[i]>max)
               {
                 temp=arr[i];
                 max=temp;
               }
            
          }
          System.out.println(max);

          System.out.println(ans);
    }
    
}
