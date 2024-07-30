import java.util.*;
public class AreaOfTriangle {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in );
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();

         int s=a+b+c;

         float area=(s*0.5F)*((s+a)*(s+b)*(s+c));
         System.out.println(area);

         // area of rhombus
         float areaofrhombus=a*b/2;
         System.out.println(areaofrhombus);

         // area of Equilateral Triangle
         float areaofEquilateral_Triangle=a*a*a;
         System.out.println(areaofEquilateral_Triangle);

         //perimeter of parallelogram
         int a1=sc.nextInt();
         int a2=sc.nextInt();
         
          int peri=2*(a1+a2);
          System.out.println(peri);
     
    }
    
}
