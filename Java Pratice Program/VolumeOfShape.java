import java.util.*;
public class VolumeOfShape {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
     int h=sc.nextInt();
     int base=sc.nextInt();
     int side=sc.nextInt();
     final float pi=3.14F;

     float v=(r*r*h*pi)*1/3F;
     System.out.println("volume of cone  " +v);

     //Volume Of Prism
     float Volume=base*h;
     System.out.println("Volume of prism  " +Volume);

     //Volume Of Cylinder pr2h
     float cylinder=pi*r*r*h;
     System.out.println("Volume Of Cylinder  "+cylinder);
     
     //Volume Of Sphere  4/3pr3
     float sphere=4/3*pi*r*r*r;
     System.out.println("Volume Of sphere  "+sphere);

     // Volume Of Pyramid  1/3*base area *h

      float pyramid=1/3*(4*side)*h;
     System.out.println("Volume Of pyramid  "+pyramid);

    }
}
