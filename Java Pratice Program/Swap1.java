
import java.util.Arrays;

public class Swap1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

      swap(arr,1,3);
      System.out.println(Arrays.toString(arr));

    }
    static void swap(int arr[],int index1,int index3)
    {
       int temp=arr[1];
       arr[1]=arr[3];
       arr[3]=temp;
    }
}
