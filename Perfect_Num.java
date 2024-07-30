import java.util.*;
public class Perfect_Num {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);

       int num=sc.nextInt();
       int num1=sc.nextInt();
       int i;
       int sum=0;
       int sum1=0;
       int rem;

    for(i=1;i<=num/2;i++)
    {

       if( num%i==0)
       {
         sum=sum+i; 
       }
      
     }
       if(sum==num)
          {
         System.out.println("number is perfect");
         }
         else{
            System.out.println("number is not  perfect");
         }

    
     for(i=1;i<=num1;i++)
     {
        rem=num1 % 10;
    num1/=10;
    sum1=rem+sum1;
  }
    System.out.println(sum1);

    
        }

}

    

