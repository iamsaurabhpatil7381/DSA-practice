import java.util.*;
public class SumOfN {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
       
        for(int i=1;i<=num;i++)
        { 
            sum=sum+i;
            
        }
     System.out.println("num ="+sum);

     System.out.println("enter any year");
     int year=sc.nextInt();

     if(year%4==0)
     {
        System.out.println("year is leep"+year);

     }
     else{
        System.out.println("year is not leep"+year);
     }
      
     //String str=sc.next();

     System.out.println("Enter any string");
     StringBuilder s1=new StringBuilder(sc.next());
        
     System.out.println(s1.reverse());




    }
    
}
