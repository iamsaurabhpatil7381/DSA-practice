import java.util.*;
public class Pad {
    public static void main(String[] args) {
        int ans='1' + '1';

        System.out.println(ans);
        // pad1("","12");
        //    System.out.println(pad2("","12"));

        System.out.println(padcount("","12"));
    }
      
    static void pad1(String p,String up)
    {

        if(up.isEmpty())
        {
              System.out.println(p);
            return ;
        }

        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            pad1(p+ch,up.substring(1));
        }
    }
    static int padcount(String p,String up)
    {

        if(up.isEmpty())
        {   
            System.out.println(p) ;
           return 1;     
        }
        int count=0;

        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
           count+=padcount(p+ch,up.substring(1));
        }
        return count;
    }

    static ArrayList<String> pad2(String p,String up)
    {

        if(up.isEmpty())
        {
             ArrayList<String> list=new ArrayList<>();
             list.add(p);
             return list;
        }

        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
           list.addAll( pad2(p+ch,up.substring(1)));
        }

        return list;
    }
}
