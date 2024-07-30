import java.util.*;;

public class LeftRotations {
    public static void main(String args[])
    {
       int[] arr={9,5,5,1,9,4,6,2,4,1,6};
        int k=3;
           
          leftRotate(arr, k);
           System.out.println(Arrays.toString(arr));

               }
            
            
  public static int[]  leftRotate(int[] arr,int k)
  {
       k=k%arr.length;
        
       int temp[]=new int[k];
         for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i];
         }

         for (int i = 0; i < arr.length-k; i++) {
            arr[i]=arr[k+i];
         }
         for (int i = arr.length-k; i < arr.length; i++) {
            arr[i]=temp[i-k-1];
         }
      
      return arr;
  }
            
}
         
    
    

