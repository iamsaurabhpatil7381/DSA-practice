import java.util.Arrays;
import java.util.Scanner;

public class Arrays11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        arr[0]=45;
        arr[1]=450;
        arr[2]=451;
        arr[3]=453;
        arr[4]=435;
        System.out.println(arr[0] +" "+arr[3]);
        System.out.println(Arrays.toString(arr));

     
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        // for(int i=1;i<arr.length;i++)
        // {
        //    System.out.println(arr[i]);
        // }
        for(int num: arr){
             System.out.println(num);

        }
    }
    
}
