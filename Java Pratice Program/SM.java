import java.util.*;
public class SM {

    
    public static void main(String[] args)
    {
        String name="raju rastogi";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toUpperCase());
        System.out.println(name.substring(8, name.length()-1));

        // System.out.println(name.indexOf('o'));
            
        // String str="ram";

        // System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(name.lastIndexOf("rastogi"));
            

    }
}

