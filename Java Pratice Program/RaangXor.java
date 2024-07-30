public class RaangXor {
    public static void main(String[] args)
    {

         int n=3;
         int b=9;

         int ans=xor(b)^ xor(n-1);
         System.out.println(ans); 

         //only for check
         int ans2=0;
         for(int i=n;i<=b;i++)
         {
            ans2^=i;

         }
         System.out.println(ans2);

    }
    static int xor(int n)
    {
        if(n%4==0)
        {
            return n;
        }
        if(n%4==1)
        {
            return 1;
        }
        if(n%4==2)
        {
            return n+1;
        }
      
            return 0;
        
    }
    
}
