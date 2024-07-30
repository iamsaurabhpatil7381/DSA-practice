import java.util.*;
public class StringRecursion {

     public static void main(String[] args)
     {
        // String p="";
        // String up="abccadh";
        //  skip(p,up);
         String str2="bdapplcd";
         //String str1="";


         //skip1(str1,str2);
            
        // skip2(str2);

        // System.out.println(skip3(str2));
         //System.out.println(skip4(str2));
         System.out.println(skipAppNotApple(str2));
     }
    //   static void skip(String p,String up)s
    //   {
    //       if(up.isEmpty())
    //       {
    //         System.out.println(p);
    //         return;
    //       }

    //       char ch=up.charAt(0);

            
    //          if(ch=='a')
    //          {
    //             skip(p,up.substring(1));
    //          }
    //          else
    //          {
    //             skip(p+ch,up.substring(1));
    //          }
    //  }
   
    //   static void skip2(String str2)
    //   {
    //     String str="";
    //     if(str2.isEmpty())
    //     {
    //         return;
    //     }
          
    //     char ch=str2.charAt(0);
    //       if(ch!='b')
    //       { 
    //          System.out.print(str+ch); ;
    //       }
    //       else
    //       {
    //          str2.substring(1);
    //       }
    //       skip2(str2.substring(1));
    //   }


    //   static String skip3(String str2)
    //   {
       
    //     if(str2.isEmpty())
    //     {
    //         return "";
    //     }
          
    //     char ch=str2.charAt(0);
         
    //       if(ch!='b')
    //       {
    //         return ch+ skip3(str2.substring(1));
    //       }
         
    //      return skip3(str2.substring(1));
    //   }
    

      static String skip4(String str2)
      {
       
        if(str2.isEmpty())
        {
            return "";
        }
          
           if( str2.startsWith("apple"))
         
          {
            return  skip4(str2.substring(5));  //it will remove the number of elements in string 

          }
         
         return str2.charAt(0)+skip4(str2.substring(1));
      }


      static String skipAppNotApple(String str2)
      {
        if(str2.isEmpty())
        {
            return str2;
        }

          if(str2.startsWith("app") && !str2.startsWith("apple"))
          {
            return skipAppNotApple(str2.substring(3));
          }
          return str2.charAt(0)+skipAppNotApple(str2.substring(1));
      }
}
