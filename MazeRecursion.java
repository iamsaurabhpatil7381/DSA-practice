import java.util.*;
public class MazeRecursion {
   public static void main(String[] args) {
    
     System.out.println(route(3, 2));

     path("",3,3);
    //  System.out.println(path1("",3,3));

    System.out.println(Diagnoal("",3,3));
   }
   
    static int route(int r,int c)
    {
        if(r==1 || c==1)
        {
            return 1;
        }

        int ans1=route(r-1,c);
       int ans2= route(r,c-1);
        int ans= ans1+ans2;

        return ans;
    }
    static void path(String p,int r,int c)
    {

        \
    
          if(r==1 && c==1)
          {
            System.out.println(p);
            return;
          }
          if(r>1 && c>1)
          {
            path(p+"d",r-1,c-1);
          }
          if(r>1)
          {
            path(p+"D",r-1,c);
          }
          if(c>1)
          {
            path(p+"R",r,c-1);
          }


    }
   
    static ArrayList<String> path1(String p,int r,int c)
    {
    
          if(r==1 && c==1)
          {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
          }
          
          ArrayList<String> list=new ArrayList<>();
          if(r>1)
          {
            list.addAll(path1(p+"D",r-1,c));
          }
          if(c>1)
          {
            list.addAll(path1(p+"R",r,c-1));
          }
        return list;

    }
    static ArrayList<String> Diagnoal(String p,int r,int c)
    {
    
          if(r==1 && c==1)
          {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
          }
          
          ArrayList<String> list=new ArrayList<>();
          
          if(r>1 && c>1)
          {
            list.addAll(Diagnoal(p+"D",r-1,c-1));
          }
          if(r>1)
          {
            list.addAll(Diagnoal(p+"V",r-1,c));
          }
          if(c>1)
          {
            list.addAll(Diagnoal(p+"H",r,c-1));
          }
        return list;

    }
   
    
}
