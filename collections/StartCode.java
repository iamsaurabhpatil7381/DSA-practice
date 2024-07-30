import java.util.*;
public class StartCode {
    public static void main(String[] args) {
        System.out.println("welcome  to code java collection");
           
        //type safe collection
         ArrayList<Integer> number =  new ArrayList<>();
               number.add(100);
               number.add(102);
               number.add(303);
               number.add(100);

               System.out.println(number);
               System.out.println(number.get(0));
               System.out.println(number.get(1));

               System.out.println(number.remove(1));

               System.out.println(number.size());1
               System.out.println(number.contains(101));
               System.out.println(number.toString());
               number.set(2, 300);
               System.out.println(number);
                 
            //un type safe collection
            LinkedList list=new LinkedList();

               list.add("rajaram");
               list.add(101);
               list.add(1001.01);
               list.add(true);

               System.out.println(list);

               Vector<Integer> vector=new Vector<>();
               vector.addAll(number);
               System.out.println(vector);



    }
    
    
}
