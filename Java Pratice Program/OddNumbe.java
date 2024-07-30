public class OddNumbe {
    public static void main(String[] args)
    {
        int n=10;
        System.out.println(isOdd(n));
    }
    
    static boolean isOdd(int n)
    {
        //    if((n& 1)==1)
        //    {
        //     return true;
        //    }
        //    return false;

        return (n&1)==1;
    }
    
}
