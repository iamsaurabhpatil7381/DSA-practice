import java.util.*;
public class Factorial11 {
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factorial(num);
    }
    
   static void factorial(int num)
   {
    int temp=1;
     for(int i=1;i<=num;i++)
     {
        temp=temp*i;
     }
      System.out.println(temp);
   }
}
