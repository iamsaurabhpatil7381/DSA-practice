import java.util.*;
public class ValidParenthsis {


public boolean isValid(String s)
{
    Stack<Character> stack=new Stack<>();

    for(char ch:s.toCharArray())
    {
        if(ch=='(' || ch=='{' || ch=='[')
        {
            stack.push(ch);
        }
        else{
            if(ch==')')
            {

                if( stack.isEmpty() || stack.pop()!='(' )
                {
                    return false;
                }
            }
            if(ch=='}')
            {
                if( stack.isEmpty() || stack.pop()!='{' )
                {
                    return false;
                }
                
            }
            if(ch==']')
            {
                if(stack.isEmpty() || stack.pop()!='[' )
                {
                    return false;
                }
            }
        }
       
    }
    return stack.isEmpty();

}
    public static void main(String[] args) {
       
        
    }
    
}
