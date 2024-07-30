import java.util.*;
public class ChangeValue {
    public static void main(String args[])
    {
        int naam=90;
        modify(naam);
        int arr[]={12,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    
     static void change(int[] num)
     {
      num[0]=90;

     }
   
     static void modify( int name)
     {
         name=80;
       // System.out.println(name);
        System.out.println(name);
     }
}
