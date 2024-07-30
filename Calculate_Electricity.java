import java.util.*;
public class Calculate_Electricity {

    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       final int per_unit=4;
       int consumption=sc.nextInt();
       float total=per_unit*consumption;

       System.out.println(total);
       
    }
    
}
