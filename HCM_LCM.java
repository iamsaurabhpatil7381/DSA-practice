import java.util.Scanner;
public class HCM_LCM {
    public static void main(String args[])
    {
        int n1,n2;
         int i;
        Scanner s1 =new Scanner(System.in);
          n1=s1.nextInt();
          n2=s1.nextInt();

        for(i=1;i<=n1;i++)
        {
            if(n1%i==0)
            {
              System.out.println(i);
            }
        }
        for(i=1;i<=n2;i++)
        {
            if(n2%i==0)
            {
              System.out.println(i);
            }
        }
        
        
    }
    
}
