import java.util.*;
public class CGPA {
    public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
      System.out.println("enter your marks");
     int  total=0;
     int  count=0;
      while(true)
      {
        int marks=sc.nextInt();
        if(marks==0)
        {
          break;
        }
        total=marks+total;
        count++;

      }
      System.out.println(total);
      System.out.println(total/count);

    }
    
    
}
