public class GCD {
    public  static void main(String[] args)
    {
        int a=3;
        int b=8;
        System.out.println(gcd(a,b));
    }

    static int gcd(int a,int b)
    {
        if(a==0)
        {

            return b;
        }
        return gcd(b%a,a);
    }

    
}
