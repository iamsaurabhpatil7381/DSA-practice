public class PalindromeRecursion {

    public static void main(String[] args)
    {
        int n=111;
        System.out.println(reverse1(n));
    System.out.println(palin( n));

    }
    static int reverse1(int n)
    {
       int digit=(int)(Math.log10(n))+1;
       return helper(n,digit);
    }
    static int helper(int n,int digit)
    {
        if(n%10==n)
        {
            return n;
        }

        int rem=n%10;

        return rem*(int)Math.pow(10,digit-1)+ helper(n/10,digit-1);
        
    }
    
    static boolean palin(int n)
    {
        // if(n==reverse1(n))
        // {
        //     return true;
        // }
        // else{
        //     return false;
        // }

        return n==reverse1(n);
    }
}
