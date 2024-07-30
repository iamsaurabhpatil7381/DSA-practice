import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
       
        Stack<Integer> stack=new Stack<>();

        System.out.println(stack.push(3));
        System.out.println( stack.push(2));
        System.out.println( stack.push(4));
        System.out.println( stack.push(5));
        System.out.println( stack.push(6));
        System.out.println(stack.push(7));
         System.out.println();
        System.out.println(stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println(stack.pop());
        stack.add(2);

        Queue<Integer> queue=new LinkedList<>();
          queue.add(1);
          queue.add(11);
          queue.add(10);
          queue.add(21);
          queue.add(133);

          System.out.println(queue);
          System.out.println(queue.peek());
          System.out.println(queue.remove());
          System.out.println(queue.remove());

          Deque<Integer> deque=new ArrayDeque<>();
          deque.add(90);
          
          deque.addFirst(20);
          deque.addLast(80);

          System.out.print(deque);
         deque.add(333);

         System.out.print(deque);
    }
    
}


