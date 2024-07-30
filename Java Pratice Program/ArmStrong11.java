//import java.util.*;
public class ArmStrong11 {
    public static void main(String args[])
    {
        
       // Scanner sc=new Scanner(System.in);
       
       // int  n=sc.nextInt();
    //   boolean ans=isArmStrog(n);
    //   System.out.println(ans);
      for(int i=100;i<1000;i++)
      {
        if(isArmStrog(i))
        {
            System.out.println(i);
        }
      }
     
    }
    
    static boolean isArmStrog(int n){
       
        int sum=0;
        int original=n;
        if(n<0)
        {
            return false;
        }
        while(n>0)
        {
           int rem=n%10;
            n/=10;
            sum=sum+rem*rem*rem;

        }
        if(sum==original)
        {
            return true;
        }
        return false;
    }
}
