public class StepsInRecursion {
    public static void main(String [] args)
    {
            int n=14;
        System.out.println(steps(n));
    }

    static int steps(int n)
    {
        return helper(n,0);
    }
    static int helper(int n,int s)
    {
        if(n==0)
        {
            return s;
        }
        if(n%2==0)
        {
            return helper(n/2,s+1);
        }
        return helper(n-1,s+1);
    }
    
}
