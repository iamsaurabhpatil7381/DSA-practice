import java.util.*;
public class Calculator {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        System.out.println("enter expression");
        while(true)
        {
            char ch=sc.next().trim().charAt(0);
            
            if(ch== '+' ||  ch== '-' ||  ch=='*' ||  ch=='%' || ch=='/')
            {
                System.out.println("enter two numbers");
             int num1=sc.nextInt();
             int num2=sc.nextInt();
              
              if(ch=='+')
              { 
                ans=num1+num2;
              }
              if(ch=='-')
              { 
                ans=num1-num2;
              }
              if(ch=='*')
              { 
                ans=num1*num2;
              }
              if(ch=='/')
              { 
                if(num2!=0)
                {
                ans=num1/num2;
                }
              }
              if(ch=='%')
              { 
                ans=num1%num2;
              }
            }

              else if(ch=='x' || ch=='X')
              {
               break;
              } 
              else{
                System.out.println("invalid expression");
              }

        System.out.println(ans);
            }

        
    }
    
}
