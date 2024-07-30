import java.util.*;
public class PrimeNumber {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       
      int n=sc.nextInt();
      boolean ans=isPrime(n);
      System.out.println(ans);
    }
   static boolean isPrime(int n)
  {
    int c=2;
    if(n<=1)
    {
        return false;
    }
     while(c*c<=n)
     {
        if(n%c==0)
        {
            return false;
        }
        c++;
     }
     if(c*c>n)
     {
        return true;
     }
     return false;
  }

    
}