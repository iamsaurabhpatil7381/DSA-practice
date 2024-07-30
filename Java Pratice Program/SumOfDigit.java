public class SumOfDigit {
    public static void main(String[] args)
    {
        int n=34;
        System.out.println(sum(n));

        int ans=product(n);
        System.out.println(ans);
        concept(n);
    }
    static int product(int n)
    {
        if(n%10==n)
        {
        return n;
         }
         return n%10 * product(n/10);
    }
    static int sum(int n)
    {
        if(n==0)
        {
        return 0;
         }
         return n%10 + sum(n/10);
    }

    static void concept(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        concept(--n);
    }
    
}
