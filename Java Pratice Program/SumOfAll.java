import java.util.*;


public class SumOfAll {
    
public static void main(String args[])    
  { 
     Scanner sc=new Scanner(System.in);
     
     int temp=0;
   
     int num;
     while (true)
      {
         num=sc.nextInt();
         if (num == 0)
         {
             break;  // Exit the loop if the user enters 0
         }
         temp+=num;
      }
        System.out.println(temp);
     
        
        
   } 
}

    

