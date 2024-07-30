public class SortrdArray {
    public static void main(String[] args)
    {
        int[] arr={5,3,4,5,6};
        System.out.println(isSorted(arr));

    }
    static boolean isSorted(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        for(int i=start;i<end-1;i++)
        {
            if(arr[start] < arr[start+1] )
            {
                return true;
            }

              
        }
        return false;

       
        
    }
    
}
