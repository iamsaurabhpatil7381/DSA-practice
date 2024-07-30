//import java.util.*;
public class LengthOfLast {
    public static void main(String[] args)
    {
       String s = "Hello World";

       System.out.println(s.toLowerCase());
       System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        s = s.trim();  // Remove trailing spaces
        
        int lastIndex = s.lastIndexOf(' ');
        
        // If there's no space, the entire string is a single word
        if (lastIndex == -1) {
            return s.length();
        }
        
        return s.length() - lastIndex - 1;
    }

    
}
