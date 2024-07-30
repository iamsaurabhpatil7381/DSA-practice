import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // String s1=sc.next();
          
        // //System.out.println(s1);
      
            
        // StringBuilder s2=new StringBuilder(s1);
        //     s2.reverse();
        //     System.out.println(s2);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       
        int result=0;

        while (number!=0) {

            result=result*10 +number%10;
            number=number/10;
        }
        System.out.println(result);

    }
}
            


