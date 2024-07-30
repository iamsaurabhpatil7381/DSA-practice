import java.util.*;
public class Enumration11 {
    public static void main(String args[])

    {
        Vector v=new Vector();
        v.add("null");
        v.add("abc");
        v.add("11");
        v.add("xub");
        v.add(22);
        
        Iterator h1=v.iterator();
       while (h1.hasNext()) {
        String s1=(String)h1.next();
        if(s1=="abc"){
            h1.remove();
        }
        else{
            System.out.println(s1);
        }
        
       }
         
      /*  Enumeration g1=v.elements();
       while(g1.hasMoreElements())
       {
         System.out.println(g1.nextElement());
       }*/
    }
    
}
