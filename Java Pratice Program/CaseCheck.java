import java.util.*;
public class CaseCheck {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         char ch=sc.next().trim().charAt(0);
         if(ch>'a' && ch<'z' )
         {
          System.out.println("lowercase");

         }
         else
         {
            System.out.println("Uppercase");
         }
        
        // int a=sc.nextInt();
        // System.out.println(a);
        // int c=20;
        // int d=40;
        // if(c==20 && d==90)  
        // {
        //     System.out.println("hello");
        // }
        // if(c!=35)
        // {
        //     System.out.println("world");
        // }

         
    }
    
}
