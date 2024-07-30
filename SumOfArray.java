import java.util.*;
public class SumOfArray {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        sc.nextInt();
        int arr[]=new int[5];
    
         for(int i=0;i<5;i++)
         {
                arr[i]=sc.nextInt();
                 
         }
                
               System.out.println(Arrays.toString(arr));


            

            int[] arr1={1,2,3,4};
            int sum=0;
           
        for(int i=0;i<=4;i++)
        {
            sum+=arr1[i];

          System.out.println(sum);
        }
    }
    
}
