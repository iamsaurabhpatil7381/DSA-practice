public class FindUnique {
    public static void main(String[] args)
    {
        int[] arr={3,4,2,1,2,1,3,6,4};

        System.out.println(unique(arr));
    }
    static int unique(int[] arr)
    {

        int ans=0;
        for(int i=0;i<arr.length;i++)

        {
           ans^=arr[i];
        =]
    
        //   for(int n:arr)
        //   {
        //     ans^=n;
        //   }
         return ans;
    }
    
}
