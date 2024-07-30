public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,3,8,4,9};
    }

    static int secondLargest(int[] arr)
    {
        int largest=arr[0];
        int secondLarge=-1;
        if(arr.length<2)
        {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest)
            {
                secondLarge=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLarge)
            {
                  secondLarge=arr[i];
            }
        }
        
    }
    
}
