import java.util.*;
public class ArrayListExample {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ans=new ArrayList<Integer>(10);

        // ans.add(88);
        // ans.add(828);
        // ans.add(828);
        // ans.add(828);
        // ans.add(828);
        // // System.out.println(ans.contains(444));
        // // System.out.println(ans.contains(88));
        // System.out.println(ans);
        // ans.set(0,99);
        // ans.remove(2);

        // System.out.println(ans);

        for(int i=0;i<5;i++)
        {
            ans.add(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
           ans.get(i); //pass index here
        }
   System.out.println(ans);
    }
    
}
