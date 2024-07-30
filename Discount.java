import java.util.*;
public class Discount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int product;
      while(true)
      {
        product=sc.nextInt();
        if(product==0)
        {
            break;
        }
        else if(product<=10000){
           float s1= product*0.75F;
           System.out.println(s1);

        }
        else if(product>=10000 && product<=100000){
            float s2= product*0.50F;
            System.out.println(s2);
        }
 
        else
        {
            System.out.println("no discount");
        }

      }
    }
    
}
