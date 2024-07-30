import java.util.*;
public class Multi_D_Arr {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> ans=new  ArrayList<ArrayList<Integer>>();

        Scanner sc=new Scanner(System.in);
      //initialising ArrayList
        for(int i=0;i<3;i++)
        {
            ans.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++)
            {
                ans.get(i).add(sc.nextInt());
            }
        }

        System.out.println(ans);

    }
    
}
