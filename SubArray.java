public class SubArray {
    public static void main(String[] args) {
        
        int [] nums = {5,4,-1,7,8};
       //System.out.println( maxSubArray(nums));
       maxSubArray(nums);
    }
    
    public static  void maxSubArray(int[] nums) 
    {  
        int sum=0;
          for (int i = 0; i < nums.length; i++) {
              for (int j = 1; j < nums.length;j++) 
              {
                   sum+=nums[j];
                   System.out.println(sum);
                  
              }
             
          }
      
    }
    
}
