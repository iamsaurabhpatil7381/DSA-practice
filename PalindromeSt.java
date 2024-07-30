// public class PalindromeSt {
//     public static void main(String args[])
//     {
//        String str1="ama";
        

//     System.out.println(isPalin(str1));
//     }

//     static boolean isPalin(String str1)
//     {
//          StringBuilder bilder=new StringBuilder(str1);
        
//            StringBuilder st= bilder.reverse();
//            if(st.toString().equals(str1))
//             {
//                  return true;
//              }

//          return false;
//     }
// }
import java.util.*;
public class PalindromeSt {
    public static void main(String[] args) {
        String str = "abcba";
    
        System.out.println(isPalin(str));
    }
     static boolean isPalin(String str)
     {
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);


            if(start != end)
            {
                return false;
            }
        }
        return true;

     }

}
