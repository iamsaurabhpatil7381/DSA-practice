import java.util.*;
public class Cursors {
    public static void main(String args[])
    {
        Vector  v1=new Vector();
        v1.add("a");
        v1.add("b");
        v1.add("c");
        v1.add("d");
        v1.add(11);
        Enumeration k1=v1.elements();
         
        while(k1.hasMoreElements())
        {
            System.out.println(k1.nextElement());
        }
    }
    
}
