public class SquareRoot1 {
    public static void main(String[] args)     
    {
       int num=16;
       System.out.println(isPerfectSquare(num));
    }
    static boolean isPerfectSquare(int num) {
          
      int start=1;
      int end=num;
       
       
       while (start<=end) {
       
        int mid=(start+end)/2;
          
            int product =mid*mid;
            if(product==num)
            {
              return true;
            }
            if (product<num) {
              start=mid+1;
              
            }
            else{
              end=mid-1;
            }
            
       }
       return false;
    }
}

























//   for(int i=1;i<=num;i++)
        //   {
        //     if(num%i==0 )
        //     {
        //        if(i*i==num)
        //        {
        //         return true;
        //        }
        //     }
        //   }
        //   return false;