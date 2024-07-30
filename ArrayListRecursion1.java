import java.util.*;
public class ArrayListRecursion1 {
    public static void main(String[] main)
    {
         int[] arr={2,3,4,5,4,6};
         int target=4;
        
         //  ArrayList<Integer> list=new ArrayList<>();
         //  findAll(arr,target,0,list);
        //  System.out.println(list);

         System.out.println(findAll(arr,target,0,new ArrayList<>()));
         
         System.out.println(findAll1(arr,target,0));
      

    }
        




    
    static ArrayList<Integer> findAll(int[] arr,int target,int index,ArrayList<Integer>list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAll(arr,target,index+1,list);
    }
    
    static ArrayList<Integer> findAll1(int[] arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= findAll1(arr,target,index+1);
        list.addAll( ansFromBelowCalls);

        return list;
    }







}
