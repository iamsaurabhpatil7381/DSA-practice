class RotatedBinarySearch {
    
        public static void main(String args[])
        {
            int [] nums={4,5,6,7,8,1,2};
            int target=2;
            System.out.println(search(nums,target));
            
            System.out.println(findPivot(nums));
        }
        public static int search(int[] nums,int target)
        {
            int pivot=findPivot(nums);
              //if u did not find pivot that means array is not rotated
              if(pivot!=-1)
              {
                  return binary(nums, target, 0, nums.length-1);
              }
               //if u  find pivot that means array is rotated
             if(nums[pivot]==1)
             {
                 return pivot;
             }
             if(target>=nums[0])
             {
                return binary(nums, target, 0, pivot-1);
             }
             return binary(nums, target, pivot+1, nums.length-1);
        }

        static int binary(int[] nums,int target,int start,int end)
        {
            int mid=start+(end-start)/2;
            if(target>mid)
            {
                start=mid+1;
            }
            else if(target<mid)
            {
                end=mid-1;
            }
            else{
                return mid;
            }

            return -1;
        }
        static int findPivot(int[] nums)
        {
            int start=0;
            int end=nums.length-1;
    
            while(start<=end)
            {
                int mid=start+(end-start)/2;
    
                //4 cases over here
    
                if(mid<end && nums[mid]>nums[mid+1])
                {
                    return mid;
                }
                if(mid>start && nums[mid]<nums[mid-1])
                {
                    return mid-1;
    
                }
                if(nums[mid]<=nums[start])
                {
                    end=mid-1;
                }
                else{
                    start =mid+1;
                }
    
    
    
    
            }
    
            return -1;
        }
    
    
        
    }
    
    
