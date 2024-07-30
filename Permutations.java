import java.util.*;
public class Permutations {
    public static void main(String[] args)
    {
      String p="";
      String up="abc";
    //   permute(p,up);
    
    //            ArrayList<String> ans= permute1(p, up);
    //            System.out.println(ans);
              
               System.out.println(countPermute2(p, up,0));
      
    }
    static void permute(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

    char ch=up.charAt(0);
         
           for (int i = 0; i <= p.length(); i++) {
               
               String f=  p.substring(0,i);
               String s=p.substring(i,p.length());

               permute(f+ch+s, up.substring(1));
           }
    }
    static ArrayList<String> permute1(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
    char ch=up.charAt(0);
         
           for (int i = 0; i <= p.length(); i++) {
               
               String f=  p.substring(0,i);
               String s=p.substring(i,p.length());

              ans.addAll( permute1(f+ch+s, up.substring(1)));
           }

           return ans;
    }
    

    static int  countPermute2(String p,String up)
    {
        if(up.isEmpty())
        {
           
            return  1;
        }

          char ch=up.charAt(0);
          int count=0;
            for(int i=0;i<=p.length();i++)
            {
                String f=p.substring(0,i);
                String s=p.substring(i,p.length());

                count+=countPermute2(f+ch+s,up.substring(1));
            }
            return count;

    }


    static int  countPermute2(String p,String up,int count)
    {
        if(up.isEmpty())
        {
           
            return  count+1;
        }

          char ch=up.charAt(0);
          
            for(int i=0;i<=p.length();i++)
            {
                String f=p.substring(0,i);
                String s=p.substring(i,p.length());

              count=countPermute2(f+ch+s,up.substring(1),count
              );
            }
          return   count;
}
}
