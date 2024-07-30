public class PowerOfFour {
    public static void main(String[] args)
    {
        int n=126;
       //System.out.println( isPowerOfFour(n));
       //System.out.println(isPower(n));

       System.out.println(isPowerOfTwo(n));
    }
    // public static boolean isPowerOfFour(int n) {
    //     int a=4;
    //     if(n==1)
    //     {
    //         return true;
    //     }
    //   for(int i=1;i<n/2;i++)
    //   {

    //     if(n==Math.pow(a,i))
    //     {
    //         return true;
    //     }
    //   }
          
    //   return false;
    // }

    public static boolean isPower(int n) {
        return (n & n - 1) == 0 & (n - 1) % 3 == 0;       
    }
    

    public static boolean isPowerOfTwo(int n)
    {
        if(n==1)
        {
            return true;
        }
        return (n & n - 1) == 0 & (n-1) % 2 == 1;
    }
}
