import java.util.*;
public class Prime {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
      // int n2=sc.nextInt();
      boolean ans=isPrimeNum(n1);
      System.out.println(ans);
    }
    
    static  boolean isPrimeNum(int n1)
    {
        int c=2;
        if(n1<=1)
        {
            return false;
        }
        while(c*c<=n1)
        {
            if(n1%10==0)
            {
                return false;
            }
            c++;
            if(c*c>n1)
            {
                return true;
            }

        }
        return false;
       
        
        
    }
}