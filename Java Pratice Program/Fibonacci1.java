 import java.util.*;
public class Fibonacci1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=num;i++)
        {
            int temp=a+b;
          a=b;
          b=temp;
         
          System.out.println( temp);

        }

    }
    
}
