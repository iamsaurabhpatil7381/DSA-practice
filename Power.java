public class Power {
    public static void main(String [] args)
    {
            
        int n=9;

        System.out.println(Integer.toBinaryString(n));
        int count=0;
        while (n>0) {
            if((n&1)==1)
             {
               
                count++;
                
             }
              n=n>>1;  
            }
        System.out.println(count);



        int base=3;
        int  power=6;
        int ans=1;

        while(power>0)
        {
            if((power & 1)==1)
              {
                 ans*=base;
              }
              base*=base;
              power=power>>1;
        }
        System.out.println(ans);
    }
    
}
