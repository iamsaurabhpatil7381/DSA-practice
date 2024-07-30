import java.util.*;
public class TreeSet {
    public static void main(String[] args) {
           System.out.println("hello  world");
               ArrayList<String>  list=new ArrayList<>();
               list.add("raju");
               list.add("rajushri");
               list.add("rajuram");
               list.add("hariraju");
               list.add("rajubhai");

               System.out.println(list);

               for(String string : list) {
                    
                      System.out.println(string +"\t" +string.length());
                    
               }
                  //traversing using Iterator:forward traversing
            Iterator<String> itr=list.iterator();

              while(itr.hasNext())
              {
                String next=itr.next();
                System.out.println(next);
              }

              System.err.println("_____________________________________________");
             
              ListIterator<String>  litr=list.listIterator(list.size());

                while(litr.hasPrevious())
                {
                    String previous=litr.previous();
                    System.out.println(previous);
                }

                System.err.println("_____________________________________________");

                list.forEach(e->{
                    System.out.println(e);
                });


                System.err.println("_____________________________________________");

                list.forEach(str->{
                  System.out.println(str);
                });

                System.err.println("_____________________________________________");

                 
                 list.forEach(e->{
                     System.out.println(e);
                 });
      }

}
    


