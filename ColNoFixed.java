import java.util.*;
public class ColNoFixed {
    public static void main(String args[])
    {
        int [][]arr={
           {12,2,35,6,6},
           {1,2},
           {22,44}
        };
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int a[]:arr)
        {
            System.out.println(Arrays.toString(a));
        }


    }
}
