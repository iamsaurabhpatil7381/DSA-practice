public class FLElement1 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        
        int[] result = searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = findStartingIndex(nums, target);
        int end = findEndingIndex(nums, target);
        return new int[]{start, end};
    }

    private static int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        
        return index;
    }

    private static int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            
            if (nums[mid] == target) {
                index = mid;
            }
        }
        
        return index;
    }
}
