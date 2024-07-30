import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr={3,6,2,-3,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  sort(int[] arr)
    {
         for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
             int maximum=max(arr, 0,last);
            swap(arr,maximum ,last);
         }
    }

    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int max(int[] arr,int s,int e)
    {
        int m=s;
        for (int i = s; i <=e ; i++) {
            if(arr[i]>arr[m])
            {
                m=i;
            }
            
        }
        return m;
    }
}
 
         
