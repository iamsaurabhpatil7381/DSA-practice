
import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,4};
    moveZero(arr);
    System.out.println(Arrays.toString(arr));

    }
    static void moveZero(int[] arr)
    {
        int insert=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0)
            {
                arr[insert]=arr[i];
                insert++;
            }
            
        }
        while (insert<arr.length) {
            arr[insert++]=0;
            
        }

    }
}
   