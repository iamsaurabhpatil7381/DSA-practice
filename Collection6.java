import java.util.*;
public class Collection6 {
    public static void main(String args[])
    {
        LinkedList l1=new LinkedList();
        l1.addFirst("hello");
        l1.addLast("ram");
        l1.add(1,"College");
        
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.get(1));
        System.out.println(l1);
    }
    
}
