import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String args[])

    {
        int arr[][]={{23,1,4},{1,2,3,8},{44,55,66},{11,22}};
         int nums=10100;


         System.out.println(digits(nums));
        int target=4;
        int ans[]=search(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }
    
    static int[] search(int arr[][],int target)
    {
         for(int r=0;r<arr.length;r++)
         {
            for(int c=0;c<arr[r].length;c++)
            {
                if(arr[r][c]==target)
                {
                   return new int[]{r,c};
                }
            }
         }
         return new int[]{-1,-1};
    }

    static int max(int arr[][])
    {
        int max=Integer.MIN_VALUE;   //initially the value will be minimum
         for(int r=0;r<arr.length;r++)
         {
            for(int c=0;c<arr[r].length;c++)
            {
                if(arr[r][c]>max)
                {
                  max=arr[r][c];
                  
                }
            }
         }
         return max;
    }

    static int digits(int nums)
    {
        return (int)(Math.log10(nums));
8
    }
}
