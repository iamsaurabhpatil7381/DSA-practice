import java.util.*;
public class Stack11 {
    public static void main(String args[])
    {
        Stack s1=new Stack();
        s1.push(11);
        s1.push(12);
        s1.push(3);
        s1.push(14);
        s1.push(15);

        s1.pop();
        s1.search(3);
        //s1.pop();
        System.out.println(s1);
        System.out.println(s1.search(3));
    }
    
}
