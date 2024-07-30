import java.util.*;
public class ArrayListRecursion2 {
    public static void main(String[] args)
    {
        int[] arr={4,3,2,3,1};
        int target=3;
         System.out.println(fun(arr,target,0,new ArrayList<>()));
    }

    static ArrayList<Integer> fun(int[] arr,int target,int index,ArrayList<Integer>list )
    {
        
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return fun(arr,target,index+1,list);

    }

    
}
