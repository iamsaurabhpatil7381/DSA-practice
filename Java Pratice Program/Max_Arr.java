public class Max_Arr {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,55};
System.out.println(maxValue(arr));


    }
    static int maxValue(int[] arr){
       int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
               
            }
        }
        return max;
    }
}
