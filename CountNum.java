//import java.util.*;
public class CountNum {
    public static void main(String args[])
    { 
      //  Scanner sc=new Scanner(System.in);
      int num=40;
      int count=0;
       while(num>0)
       {
        int  rem=num % 10;
            if(rem==3){
                count++;
               
            }
            num=num/10;
       }
      System.out.println(count);
    }
    
}
