import java.util.*;
public class Vowel {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        //String s1=sc.next();
        //char s1;
        

        for( char i='a';i<='z';i++)
        {
            System.out.println(i);
             if(i=='a' || i=='i' || i=='e' || i=='o' || i=='u')
             {
               System.out.println(" this is vowels" );

             }
            else
             {
                 System.out.println(" this is consonant" );
             }
        }
    }
    
}
