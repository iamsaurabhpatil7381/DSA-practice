public class DuplicateE {
    public static void main(String[] args) {
       int[] nums = {1,3,3,3,3};
       System.out.println(findDuplicate(nums));


           // System.out.println(findCountDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j] && i!=j)
                {
                   
                   count++;
                } 
            }
        }
        return count;
    }

   
}
