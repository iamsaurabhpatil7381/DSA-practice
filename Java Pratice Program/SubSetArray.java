import java.util.*;
public class SubSetArray {
    public static void main(String[] args) {
        
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for( List<Integer> list :ans)
        {
            System.out.println(list);
        }

        List<List<Integer>> ans1=subset1(arr);1

        for(List<Integer> list1:ans1)
        {
            System.out.println(list1);
        }
          
    }

    static List<List<Integer>>  subset(int[] arr)
    {
         List<List<Integer>>  outer=new ArrayList<>();

         outer.add(new ArrayList<>());

           for(int num:arr)
           {
            int n=outer.size();
              for(int i=0;i<n;i++)
              {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
              }
           }

           return outer;
    }
    
    static List<List<Integer>>  subset1(int[] arr)
    {
        List<List<Integer>> out=new ArrayList<>();

        out.add(new ArrayList<>());
        
        for(int num:arr)
        {
            int n=out.size();

            for(int i=0;i<n;i++)
            {
                List<Integer> inter=new ArrayList<>(out.get(i));
                inter.add(num);
                out.add(inter);
            }
        }
        return out;
    }
}
