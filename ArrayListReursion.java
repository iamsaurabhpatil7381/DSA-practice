import java.util.*;
public class ArrayListReursion {
    public static void main(String[] args) {
        int[] arr={4,3,2,5,1};

    //     Arrays.sort(arr);
    //  System.out.println(Arrays.toString(arr));
    ArrayList<Integer> list=new ArrayList<>();
        add(arr, 0,list );
    System.out.println(list);

       }

    static ArrayList<Integer> add(int[] arr,int i,ArrayList<Integer> list)
    {
       if(i >=arr.length)
       {
        return  list;
       }
            
       list.add(arr[i]);
     
       
         return add(arr, i+1, list);
    }
}
