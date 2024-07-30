import java.util.*;
public class MergeArray {
    public static void main(String[] args) 
    {
          int[] arr={1,2,3};
          int[] nums={4,5,6};
          merge(arr,nums);
    }
    static void merge(int[] arr,int[] nums)
    {
        int[]  c=new int[arr.length + nums.length];

        //size of array c
        //add elements

        for(int i=0;i<arr.length;i++)
        {
            c[i]=arr[i];
        }

        for(int j=0;j<nums.length;j++)
        {
           c[j+arr.length]=nums[j];
        }
    System.out.println(Arrays.toString(c));
    }
    
}

