
import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
      int[][] arr={
                    {10,20,30},
                    {15,25,35},
                    {18,29,38}};

                    System.out.println(Arrays.toString(findElement(arr, 38)));
      }

    
    static int[] findElement(int arr[][],int target)
    {
        int r=0;
        int c=arr.length-1;
        

   while (r<arr.length && c>=0) 
   {
   
            if(arr[r][c]==target)
           {
                 return new int[]{r,c};
           }
           else if(arr[r][c]<target)
           {
              r++;  
              //elements in that column will be smaller than target element bcoz it's acsending order
           }
           else
           { 
             c--; //elements in that column will be more than target element bcoz it's acsending order
            
           }


         }

        return new int[]{-1,-1};
         
    
  }
}

