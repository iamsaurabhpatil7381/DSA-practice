import java.util.*;
public class AreaOfCircle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       final float pi=3.14F;
        int r=3;
      System.out.println((pi*pi)*r);
      System.out.println(2*pi*r);


         int height=sc.nextInt();
         int base=sc.nextInt();
         float area=0.5F*height*base;
         System.out.println(area);

         //area of rectangle
         int area1=height*base;
        
         System.out.println(area1);


    }
     
}
