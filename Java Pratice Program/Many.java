import java.util.*;
public class Many {
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        float dep=sc.nextFloat();

        if(dep!=0 && dep<=100)
        {
         float remaining=num*dep/100;
         System.out.println(remaining);

        }
        else{
            System.out.println("not possible to calculate");
        }


    }
    
}
