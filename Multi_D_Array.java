import java.util.*;
public class Multi_D_Array {
    public static void main(String args[])
    {
        // ArrayList <Integer> sh=new ArrayList<Integer>();
        // sh.add(11);

        // System.out.println(sh);
   Scanner sc=new Scanner(System.in);
        ArrayList <ArrayList<Integer>> sh=new ArrayList<ArrayList<Integer>>();
        //initialising arraylist

        for(int i=0;i<5;i++)
        {
            sh.add(new ArrayList<>());

        }
      for(int i=0;i<5;i++)
     {
        for(int j=0;j<5;j++)
        {
         sh.get(i).add(sc.nextInt());
        }
      }
      System.out.println(sh);
       
    }
    
}
