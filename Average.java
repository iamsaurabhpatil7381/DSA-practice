import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int num;
        int count=1;
        while (true) 
        {
           num=sc.nextInt();
           if(num==0)
           {
            break;
       
           }
           temp+=num;
           count++;
        }
      System.out.println(temp+" "+count);
      float avg=temp/count;
      System.out.println(avg);


    }
    
}
