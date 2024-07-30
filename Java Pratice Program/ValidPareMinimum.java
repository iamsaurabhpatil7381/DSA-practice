import java.util.*;
public class ValidPareMinimum {

    public static int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
          int open=0;
          int close=0;
        for (char ch: s.toCharArray()) {
             
            if(ch=='(')
            {
                if(!stack.isEmpty() && stack.peek()==')')
                {
                    stack.pop();
                    if(!stack.isEmpty() && stack.peek()==')')
                    {
                        stack.pop();
                    }
                    else{
                        close++;
                    }
                }
              }
              
            }
            return close;
        }
        public static void main(String[] args) {
            String s="(()))";
           System.out.println( minInsertions(s));
           System.out.println(2^2^3);
        }
}