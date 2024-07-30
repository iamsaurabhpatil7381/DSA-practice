import java.util.*;
public class SumOfMethod {

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      sum(n);
    }

    static void sum(int n)
    {
      int   temp=0;
      if(n>0)
      {
         for(int i=1;i<=n;i++)
         {
           temp=temp+i;
         }
         System.out.println(temp);

      }
    }
}
