public class TwoSum {
   
    public static void main(String[] args)
    {
       int[] nums = {2,5,5,11,18};
       int target = 10;
           
      int [] result=sum(nums, target);
        if(result!=null)
        {
         System.out.println(result[0]+  " "+result[1]);
        }
        else
           {
            System.out.println("no solution found");
           }
                     
       

    }
    public static int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) 
        {
            for (int j = i+1; j < nums.length; j++) {
               
             if(nums[i]+nums[j]==target)
             {
               return  new int[]{i,j};
             }
            }
            
           
        }
        return null;
        
           
        
        

    }
    
}

