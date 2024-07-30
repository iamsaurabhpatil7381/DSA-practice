import java.util.*;
public class SubSequencesString {
    
   public static void main(String[] args)
   {
         String pro="";
         String unpro="abc";
        //   char a='b';
        // System.out.println(a);
         squence(pro,unpro);

        //  System.out.println(squen1(pro, unpro));

        //  squence2(pro, unpro);

        //  System.out.println( asciiValue(pro,unpro));
         
   }

    static  void squence(String pro,String unpro)
    {
        if(unpro.isEmpty())
        {

            System.out.println(pro);

            return;
        }

        char ch=unpro.charAt(0);

          squence(pro+ch,unpro.substring(1));

          squence(pro,unpro.substring(1));
    }


    static ArrayList<String> squen1(String pro,String unpro)
    {
        ArrayList<String> list=new ArrayList<>();
         if(unpro.isEmpty())
         {
            list.add(pro);
            return list;
         }
   
         char ch=unpro.charAt(0);

         ArrayList<String> left=squen1( pro+ch,unpro.substring(1));
         
         ArrayList<String> right=squen1( pro, unpro.substring(1));


         left.addAll(right);
       return left;
    }
   
           static void squence2(String pro,String unpro)
          {
              if(unpro.isEmpty())
              {
                System.out.println( pro);
                return;
              }

             char  ch=unpro.charAt(0);

                squence2(pro+ch ,unpro.substring(1));
                squence2(pro ,unpro.substring(1));
                  squence2(pro+(ch+0) ,unpro.substring(1));
           }


static ArrayList<String> asciiValue(String pro,String unpro)
    {
        ArrayList<String> list=new ArrayList<>();
         if(unpro.isEmpty())
         {
            list.add(pro);
            return list;
         }
   
         char ch=unpro.charAt(0);

         ArrayList<String> left=asciiValue( pro+ch,unpro.substring(1));
         
         ArrayList<String> right=asciiValue( pro, unpro.substring(1));
         ArrayList<String> middle=asciiValue( pro+(ch+0), unpro.substring(1));
         

         left.addAll(right);
         left.addAll(middle);
       return left;
    }
}
