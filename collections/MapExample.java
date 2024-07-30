import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> courses=new HashMap<>();

        courses.put("core java",4030);
        courses.put("python",3500);
        courses.put("Spring1" ,8000);
        courses.put("Spring" ,4000);
        courses.put("Android",30202);
        courses.put("php",400);
             
        System.out.println(courses);
         
        courses.forEach((e1,e2)->
        {
            System.out.println(e1 +"=>"+e2);
        });
        
        courses.forEach((e1,e2)->
        { 
            System.out.println(e1+"  ==>"+e2);
        });

        System.out.println(courses.get("core java"));

        System.out.println(courses.get("python"));
    }
    
}
