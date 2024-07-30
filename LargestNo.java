import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int sum =0;
        int num;
        while (true)
         {
            num=sc.nextInt();
            if (num == 0)
            {
                break;  // Exit the loop if the user enters 0
            }
            sum+=num;
         }
           System.out.println(sum);
    }
    
}
        
       