import java.util.*;

public class ListIterator1 {
    public static void main(String args[])
    {
        LinkedList <String> l2= new LinkedList<>();
        l2.add("A");
        l2.add("b");
        l2.add("c");
        l2.add("d");
        l2.add("e");
       ListIterator h1=l2.listIterator();
       /*while(h1.hasNext())
       {
        System.out.println(h1.next());
       }*/
       while(h1.hasNext()){
         String s1=(String)h1.next();
       if (s1=="d") {
        h1.remove();
        }
        else{
            System.out.println(s1);
        }
    }
       while(h1.hasPrevious())
       {
        System.out.println(h1.previous());
       }
    }
}
