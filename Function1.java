import java.util.*;
public class Function1 {
    public static void main(String args[])
    {  
        int ans=sum1();
         System.out.println(ans);
         Scanner sc=new Scanner(System.in);
         String name=sc.next();
        String s1= greet(name);
        System.out.println(s1);
        int m1=s1(10,90);
        System.out.println(m1);


    }
        static int sum1()
        {
           Scanner sc=new Scanner(System.in);
           int  num2=sc.nextInt();
           int num3=sc.nextInt();
           int s=num2+num3;
           return s;
   
        }
      static int s1(int a,int b)
      {
        int sum=a+b;
        return sum;
      }
    
       static String greet(String name)
    {
        String str="hello " +name;
        return str;
    }
}
