import java.util.*;
public class Collection2 {
    public static void main(String args[])
    {
        ArrayList l1=new ArrayList(5);
        l1.add("g");
        l1.add("h");
        l1.add(1,"g");
        //System.out.println(l1);
        Iterator g1=l1.iterator();
        //l1.remove(2);
        //System.out.println(l1);
        while(g1.hasNext())
        {
               String s1=(String)g1.next();
            if(s1!="g")
            {
            System.out.println(s1);
            }
        }
    }

    
}
