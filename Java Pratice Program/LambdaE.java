import java.util.*;
import java.util.function.Consumer;
     

public class LambdaE  {

    public static void main(String[] args) {
        ArrayList<Integer>    list=new ArrayList<>();
        for (int i = 0; i <6; i++) {
              list.add(i);
        } 
       

      list.forEach((item)-> System.out.println(item*2));

       Consumer<Integer> fun=(item)-> System.out.println(item*2);
      list.forEach(fun);
              Operation sum=(a,b)->a+b;
              Operation product=(a,b)->a*b;
              Operation div=(a,b)->a/b;

              LambdaE calcu=new LambdaE();
              System.out.println(calcu.operation(4, 3,sum));
              System.out.println(calcu.operation(4, 5,product));
              System.out.println(calcu.operation(4, 3,div));

      
        }
        private int operation(int a,int b,Operation op)
        {
            return  op.operation(a,b);
        }
    }
interface Operation{
    int operation(int a,int b);
}
