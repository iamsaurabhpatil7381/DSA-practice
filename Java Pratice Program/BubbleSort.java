import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={3,2,1,5,4};
       // int[] arr={};
      // int [] arr={1,-2,3,-4,0,5};
      sort(arr);
      System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr)
    {
          //run the loop till the end of elements get sorted
          boolean swapped;

         //use bubble sort
         for (int i = 0; i < arr.length; i++) {

            swapped=false;
            for (int j = 1; j < arr.length-i; j++) {
                
                //use the swap algo
                if(arr[j]<arr[j-1])
                {
                int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                   swapped=true;
                }


            }
            //if u didnot swap for a particular value of i ,it means the array is sorted
            
            if(!swapped)
            {
                break;
            }
         }
        
    }
    
}
