import java.util.*;
public class PalindromeSt1 {
    public static void main(String[] args)
    {
       String str="ramar";
       System.out.println(Arrays.toString(str.toCharArray()));
    
            // StringBuilder bilder=new StringBuilder(str);
            // System.out.println(bilder.reverse());

            // System.out.println(bilder.indexOf("m"));
            // System.out.println(bilder.lastIndexOf(str));


              for(int i=0;i<str.length();i++)
              {
                StringBuilder bilder=new StringBuilder(str);
                System.out.println(bilder.indexOf(str));
              }

    }
    
    
}
