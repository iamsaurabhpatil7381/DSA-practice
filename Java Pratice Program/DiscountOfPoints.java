import java.util.*;
public class DiscountOfPoints {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three amounts");
        int dis1=sc.nextInt();
        int dis2=sc.nextInt();
        int amt=sc.nextInt();
        int distance;
        
          if(dis1>dis2)
            {
             distance=dis1-dis2;
            System.out.println(distance);
            }
            else{
                System.out.println("distance cannot be negetive");
            }
    
      float commsion=amt*0.10F;
       System.out.println(commsion);

       //power in java
       System.out.println("enter number for power");
       int a=sc.nextInt();
       
       int b=sc.nextInt();

       System.out.println(Math.pow(a, b));


    }
    
}
