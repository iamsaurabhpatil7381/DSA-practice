import java.util.*;
public class ArrayListRecursion {
    public static void main(String[] main)
    {
         int[] arr={2,3,4,5,4,6};
         int target=4;
        //  find(arr, target, 0);
        //  System.out.println(list);
        
         //  ArrayList<Integer> list=new ArrayList<>();
         //  findAll(arr,target,0,list);
        //  System.out.println(list);

         System.out.println(findAll(arr,target,0,new ArrayList<>()));
         
         //  find1(arr,target);

    }
        // static void find1(int[] arr,int target)
        // {
        //     ArrayList<Integer> list=new ArrayList<>();
        //     for(int i=0;i<arr.length;i++)
        //     {
        //         if(arr[i]==target)
        //         {
        //             list.add(i);
        //         }
        //     }
            
        //     System.out.println(list);
             
        // }




    //  static  ArrayList<Integer> list=new ArrayList<>();
    // static void find(int[] arr,int target,int index)
    // {
    //     if(arr[index]==arr.length)
    //     {
    //        return;
    //     }

    //     if(arr[index]==target)
    //     {
    //         list.add(index);
    //     }

    //     find(arr,target,index+1);
       
    // }

    static ArrayList<Integer> findAll(int[] arr,int target,int index,ArrayList<Integer>list)
    {
        if(arr[index]==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAll(arr,target,index+1,list);
    }
    
}
