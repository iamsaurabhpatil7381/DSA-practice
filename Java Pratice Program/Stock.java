public class Stock {

    public static int sell(int[] arr)
    {
    int maxProfit=0;
    int minSoFar=arr[0];
     
    for (int i = 0; i < arr.length; i++) {
        minSoFar=Math.min(minSoFar, arr[i]);
           int profit=arr[i]-minSoFar;
         maxProfit=Math.max(maxProfit,profit );
        
       }
      return maxProfit;
   }


    public static void main(String[] args) {
        
        int[] arr={5,2,6,1,4};

        System.out.println(sell(arr));




       
    }
    
}
