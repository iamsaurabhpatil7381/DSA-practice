public class SetBits {
    public static void main(String args[])
    {
        int n=2;
        System.out.println(setBits(n));
         
        System.out.println(xor(n));
        

        System.out.println(Integer.toBinaryString(n));
    }
    static int setBits(int n)
    {
        int count=0;

        while(n>0)
        {
            n=n&(n-1);
            count++;
        }



        return count;
    }

    static int xor(int n)
    {

       return n^(n-1);
    }
}
