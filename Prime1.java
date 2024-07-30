public class Prime1 {
    public static void main(String[] args)
    {
        int n=11;

            for(int i=0;i<n+1;i++)
            {
                System.out.println( i+" "+isPrime(i));
            }
        System.out.println(isPrime(n));

    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
         int start=2;
         while(start*start<=n)
         {
             if(n% start==0)
             {
                return false;
             }
            start++;

         }
         return true;
    }
    
}
