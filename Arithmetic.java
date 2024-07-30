import java.util.Scanner;
public class Arithmetic {
    public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   int num=sc.nextInt(); 
   int num1=sc.nextInt(); 

   if(num>num1)
   {
    int s=num/num1;
    System.out.println(s);
   }
   else{
    System.out.println("cannot divide by larger number");
   }
   System.out.println(num+num1);
   System.out.println(num-num);
   System.out.println(num*num);  
  }

    
}
