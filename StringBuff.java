   import java.util.*;
   import java.text.*;
public class StringBuff {
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb=new StringBuffer();

        System.out.println(sb.capacity());

         //constructor 1
         StringBuffer sb1=new StringBuffer("kunal kushwaha");

          //constructor 1
        StringBuffer sb2=new StringBuffer(30);  //size of the character
        System.out.println(sb2.capacity());
        sb.append("saurabh");
        sb.append("  ram");

        //sb.insert(2, " rahul ");

        sb.replace(2,5 ,"raju");
        sb.delete(2,6);
        sb.reverse();
        String str=sb.toString();
        System.out.println(str);

        // Random random=new Random();
     
        //    System.out.println(random.nextFloat());
        //    System.out.println((char)(97+1));

        int n=20;
        String name=RandomString.generate(n);
        System.out.println(name);

        String str1="jejj ej jeke ekeke";
        System.out.println(str1);

        System.out.println(str1.replaceAll("\\s",""));

        String arr="kunal ,shree ,hari ,ram";

        String[] names=arr.split(",");
        System.out.println(Arrays.toString(names));

        DecimalFormat df=new DecimalFormat("0.0000");
        System.out.println(df.format(3.7));
      
    }
    
}
