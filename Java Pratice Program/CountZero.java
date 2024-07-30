public class CountZero {
    public static void main(String[] args) {
         int n=1020300; 
         System.out.println(count(n));
         System.out.println(count1(n));
         System.out.println(count2(n));
    }
    static int count(int n)
    {
        int cou=0;
          while (n>0) {
            int rem=n%10;
              if(rem==0)
              {
                cou++;
              }
              n/=10;
            }
            return cou;
    }
   static int cou=0;
    static int count1(int n) 
    {
         if(n%10==n)
         {
            return n;
         }
         int rem=n%10;
         count1(n/10);
            if(rem==0){
                cou++;
            }
          

         return  cou;
    }

    static int count2(int n)
    {
        return helper(n, 0);
    
    }
    static int helper(int n,int c)
    {
      if(n==0)
      {
        return c;
      }
        
       int rem=n%10;
       if(rem==0)
       {
         return helper(n/10, c+1);
       }
       return helper(n/10, c);
    }
    
}
