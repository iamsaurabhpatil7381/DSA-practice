public class FirstAndLastPosition {
 
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
    
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    
static int[] searchRange(int [] nums,int target)
  {
       int [] ans={-1,-1};
       //chec for first occurence if target first
        ans[0]=search(nums,target,true);
        
      
      if(ans[0]!=-1)
      {
        ans[1]=search(nums,target,false);
      }
       return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // Potential answer found
                ans = mid;
                if (findStartIndex) {
                    // For finding the start index, we continue searching towards the left (lower indices)
                    end = mid - 1;
                } else {
                    // For finding the end index, we continue searching towards the right (higher indices)
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    
}
