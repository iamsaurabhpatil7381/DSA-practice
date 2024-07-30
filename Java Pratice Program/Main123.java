import java.util.*;
public class Main123{
    public static void main(String[] args)throws  CloneNotSupportedException {
    
      Human kunal=new   Human(9,"ram");
     //  Human twin=new Human(kunal);
     Human twin=(Human)kunal.clone();
     System.out.println(twin.age+" "+ twin.name);
     System.out.println(Arrays.toString(twin.arr));
       twin.arr[0]=100;
       System.out.println(Arrays.toString(twin.arr));
       System.out.println(Arrays.toString(kunal.arr));
    }
    
}
