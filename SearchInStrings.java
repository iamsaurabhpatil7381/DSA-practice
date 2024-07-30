

import java.util.*;
public class SearchInStrings {
    public static void main(String [] args)
    {
       String name="raju";
       char target='u';
       
       System.out.println(Arrays.toString(name.toCharArray()));
       System.out.println(search(name,target));


    }
    static boolean search(String name,char target)
    {
        for(char i=0;i<name.length();i++)
        {
            if(target==name.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    
}
