import java.util.*;
public class LeftRotatateArr {
  public static void main(String[] args) {
    
    int[] arr={2,3,1,4,5,6};
        int n=arr.length;
      int temp=arr[0];
       for (int i = 1; i < n; i++) {
           arr[i-1]=arr[i];

           
       }
       arr[n-1]=temp;
      

       System.out.println(Arrays.toString(arr));
  }   

 
}
