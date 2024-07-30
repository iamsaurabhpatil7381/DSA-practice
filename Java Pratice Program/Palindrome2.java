import java.util.*;
public class Palindrome2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

      check(n);
       
    }

   static void check(int n)
    { 
        int original=n;
      if(n<=0) 
      {
        System.out.println("num is not palindrome");
      }
     
        int temp=0;
        while (n>0) {
        {
           int rem=n%10;
          
           temp= temp+(rem*rem*remn);
           n=n/10;
        }
       
      }
      System.out.println(temp);
      if(temp==original)
      {
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
    }
    
}
