import java.util.*;
public class Palindrome1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
    int temp=0;
      while(a>0)
       {
          int rem=a % 10;
          a/=10;
          temp=temp*10 +rem;
       }
      
      System.out.println(temp);
    }
    
}
