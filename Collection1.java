import java.util.*;
 class Collection1 {
    public static void main(String args[])
    {
        ArrayList s1=new ArrayList(5);
        ArrayList s2=new ArrayList(3);
        s1.add("a");
        s1.add("a");
        s1.add("a");
        System.out.println(s1);
        s2.add("a");
        s2.add("b");
        s2.add("c");
        System.out.println(s2);

        s1.addAll(s2);
        System.out.println(s1);
        s1.remove("a");
        s1.removeAll(s2);
      
        System.out.println(s1);
    }            
    
}
