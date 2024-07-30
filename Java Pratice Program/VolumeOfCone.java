import java.util.*;
public class VolumeOfCone {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
     int h=sc.nextInt();
     final float pi=3.14F;

     float v=(r*r*h*pi)*1/3F;
     System.out.println(v);



    }
}
