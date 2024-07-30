import java.util.*;
public class User_Input {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int sum=0;
      int sum1=0;
      int sum2=0;
        while(true)
        {
           int  num=sc.nextInt();
           
            if(num==0)
            {
                break;
            }
            if(num<=0)
            {
                sum=sum+num;
               
            }
            if(num>0 && num%2==0)
            {
                sum1=sum1+num;
            }
            if(num>0 && num%2!=0)
            {
                sum2=sum2+num;
            }
         
           
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
    }
    
}
