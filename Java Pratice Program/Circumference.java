import java.util.*;
public class Circumference {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       float radius=sc.nextFloat();
       circle(radius);
    }

    static void circle(float radius)
    {
       float circum=2*3.14F*radius;
       float area=3.14F*radius*radius;
       System.out.println(circum);
       System.out.println(area);
    }
    
}
