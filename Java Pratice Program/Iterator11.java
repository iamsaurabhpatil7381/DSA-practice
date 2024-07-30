import java.util.*;
public class Iterator11 {
    public static void main(String args[])
    {
      Vector  h1=new Vector();
      h1.add("abc");
      h1.add("a33");
      h1.add("a11");
      h1.add("ab");
      h1.add("xyy");

     Iterator m1=h1.iterator();
     while(m1.hasNext())
     {
         String s1=(String)m1.next();
         if(s1=="a33" || s1=="ab"){
            m1.remove();

         }
         else{
            System.out.println(s1);
         }
     }


     /*  Enumeration e1=h1.elements();
      while(e1.hasMoreElements())
      {
        System.out.println(e1.nextElement());
      }
       */

    }
    
}
