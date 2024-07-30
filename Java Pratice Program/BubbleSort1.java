import java.util.Arrays;

public class BubbleSort1 {

  public static void main(String[] args) {
    int [] arr={-3,9,-4,3,5,-8};
   int[] ans= swap(arr);
   System.out.println(Arrays.toString(ans));
  }

  static int[] swap(int[]arr)
  {
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 1; j < arr.length; j++) {
        if(arr[j]<arr[j-1])
        {
          int temp=arr[j];
          arr[j]=arr[j-1];
          arr[j-1]=temp;
        }
      }
      
    }


    return arr;
  }
}