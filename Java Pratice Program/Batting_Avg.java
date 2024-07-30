import java.util.*;
public class Batting_Avg {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int s1=0;
     int count=0;

     while(true)
     {
        int score=sc.nextInt();
        if(score==0)
        {
            break;
        }
           s1=s1+score;

      count++;
     }
     System.out.println(s1);
     System.out.println(s1/count);
    }
    
}
