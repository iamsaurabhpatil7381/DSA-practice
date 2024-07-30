import java.util.*;
public class Odd_EvenFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      OddEven(n);
      eligibility(n);
      int ans=sum(a,b);
      System.out.println(ans);

      int s1=product(a,b);
      System.out.println(s1);

    }
   static void OddEven(int n)
   {
       if(n%2==0)
       {
        System.out.println("number is even");
       }
       else{
        System.out.println("number is odd");
       }
   }


   static void  eligibility(int n)
   {
       if(n>=18)
       {
        System.out.println("you are eligible");
       }
       else{
        System.out.println("you are not eligible");
       }
   }

   static int sum(int a,int b)
   {
    return a+b;
    
   }
   static int product(int a,int b)
   {
    return a*b;
    
   }
    
}
