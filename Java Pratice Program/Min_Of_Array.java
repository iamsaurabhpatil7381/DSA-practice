public class Min_Of_Array {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,-4,5,6,7};
        //find minimum of an array
        min(arr);
        System.out.println(min(arr));

        max(arr);
        System.out.println(max(arr));
       
    }
    static int min(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(ans>arr[i])
            {
                ans=arr[i];
            }
        }
        return ans;

          

    }
    static int max(int arr[]){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(ans<arr[i])
            {
                ans=arr[i];
            }
        }
        return ans;

          

    }
}
