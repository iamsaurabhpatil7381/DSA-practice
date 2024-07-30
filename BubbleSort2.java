import java.util.Arrays;
public class BubbleSort2 {
  public static void main(String[] args) {

    int [] arr={2,3,1,4,6,7,9,8};
    System.out.println(Arrays.toString(sort(arr)));
    
  }

  static int[] sort(int[] arr)

  {
    int temp=0;
      for (int i = 0; i < arr.length-1; i++) 
      {
        for (int j = 1; j < arr.length; j++) 
        {
               if(arr[j]<arr[j-1])
               {
                   temp=arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;

               }
          }
        
      }
      return  arr;

  
  }
}
