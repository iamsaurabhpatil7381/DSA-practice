import java.util.Scanner;
public class  Crucial
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number: ");
      int a=sc.nextInt();
   
     int count=0;
    
      int temp=1; 
      while(a!=0)
      {
        int rem = a%10;
        temp*=rem;
        count+=rem;
        a=a/10;
         
        
      }
      System.out.println(temp);
      System.out.println(count);

      int subtract=temp-count;
      System.out.println(subtract);
      






    }
}
 