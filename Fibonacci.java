import java.util.*;
public class Fibonacci {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp;
      int n1=0;
      System.out.println(n1);
      int n2=1;
     //temp=n1+n2;
    
     for(int i=2;i<=num;i++)
     {
        temp=n1+n2;
        n1=n2;
     n2=temp;
   
       System.out.println(temp);
     }
      
     
    }
    
}
