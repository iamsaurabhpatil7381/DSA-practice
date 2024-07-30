import java.util.*;
public class StringOperator {

    public static void main(String[] argsz)
    {
        
        System.out.println('e'+'f');
        System.out.println('a'+3);
        System.out.println("a"+"b");
        float m=3030.848f;
        System.out.println((int)m);
        System.out.println((char)('a'+3));

        System.out.println("a"+1);

        System.out.println("kunao"+ new ArrayList<>());  //the second will be converted into toString
        System.out.println(new Integer(56) + "  str "+ new ArrayList<>());
          //+ operator will work if there is mimimum single  string either it may be empty or not
    }
    
}
