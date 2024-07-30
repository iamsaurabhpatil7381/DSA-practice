public class RotatedBS {
    public static void main(String[] args)
    {
      int[]  nums = {4,5,6,7,0,1,2};
     
      int target = 2;
      
       System.out.println(search(nums,target));   
    
    }
        
    public static int search(int[] nums, int target)
         {
            int pivot=findPivot(nums);
             if(pivot==-1)
             {
                return bs(nums,target,0,nums.length-1);

             }
             else if(target==nums[pivot])
             {
                return pivot;
             }
             
               if(target>=nums[0])
               {
                 return bs(nums,target,0,pivot+1);
               }
               return bs(nums,target,pivot+1,nums.length-1);
    
             
         }
         public static int  bs(int[] nums,int target,int start,int end)
         {
               
              while(start<=end)
              {
                int mid=start+(end-start)/2;
                   
                if(target==nums[mid])
                {
                   return mid;
                }
                else if(target>nums[mid])
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return -1;
         }
       
         public static int findPivot(int[] nums)
         {
            int start=0;
            int end=nums.length-1;

            while(start<=end)
            {
                int mid=start+(end-start)/2;
                  
                  if(mid<end && nums[mid]>nums[mid+1])
                  {
                    return mid;
                  }
                  else if(mid>start && nums[mid]<nums[mid-1])
                  {
                    return mid-1;
                  }
                  else if(nums[mid]<=nums[start])
                  {
                       end=mid-1;
                  }
                  else
                  {
                    start=mid+1;
                  }


            }
            return -1;
         }
    }
      
    
