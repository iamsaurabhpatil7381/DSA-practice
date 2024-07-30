import java.util.*;
public class ListIterator11 {
    public static void main(String args[])
    {
        Vector v1=new Vector();
        v1.add("saura");
        v1.add("maha");
        v1.add("22ja");
        v1.add("koo");
        v1.add("hdhd");

       ListIterator l1 =v1.listIterator();
       while(l1.hasNext())
       {
          String s1=(String)l1.next();
        if(s1.equals("koo"))
        {
            l1.set("c programming");
        }
        else if(s1.equals("saura"))
        {
            l1.set("c++ programming");
        }
        else if(s1.equals("c programming")) {
            l1.add("python");
        }
        else if(s1.equals("22ja"))
        {
            l1.remove();
        }
        System.out.println(s1);
        System.out.println(l1.nextIndex());
       }
       while(l1.hasPrevious())
       {
        System.out.println(l1.previous());
       }
    
       l1=v1.listIterator();
       while(l1.hasNext())
       {
        System.out.println(l1.next());
       }

    }
    
}
