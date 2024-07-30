import java.util.*;
public class PrimeNum {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      boolean ans=prime(a);
      System.out.println(ans);
    }
 static  boolean prime(int a)
 {
    int c=2;
    if(a<=1)
    {
        return false;
    }
    while(c*c<=a)
    {
      
       if(a%c==0)
        {
        return false;
        }
        c++;
    }
       if(c*c>a)
       {
         
          return true;
       }
    return false;
 }
    
 }

