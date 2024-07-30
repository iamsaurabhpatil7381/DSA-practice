import java.util.*;
public class VartArgs {
    public static void main(String args[])
    {
     //fun(1,23,3,4,5,6,7);
     moon(1,3,"saurabh","patil");
     moon(1,2,3,4);

    }
    static void moon(int a,int b,String ...v)
    {
       System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v)
    {
        
        System.out.println(Arrays.toString(v));

    }
    static void moon(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
