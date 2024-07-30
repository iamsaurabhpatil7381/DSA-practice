import java.util.*;
public class Animals {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
    
       int n= scanner.nextInt(); //total numbers of animals
       int  l= scanner.nextInt();   //total numbers of legs
        
       int x;   //number of two legs animals
       int y; //number of four legs animals
       System.out.println(n+" "+l);

       
    //    y=((n-2*l)/2);

    //    x=l-y;

       x=(4*n-l)/2;
       y=n-x;

       System.out.println(x+" "+y);

    }
    
}
