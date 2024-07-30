 import java.util.Arrays;
// import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        int []arr={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        num(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void num(int[] arr)
    {
       arr[3]=440;
    }
}
