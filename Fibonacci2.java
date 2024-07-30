import java.util.*;
public class Fibonacci2 {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();

      int a=0;
      int b=1;
      int temp;
      for(int i=1;i<=num;i++)
      {
        temp=a+b;
        a=b;
        b=temp;
        System.out.println(temp);
      }

    }
    
}
