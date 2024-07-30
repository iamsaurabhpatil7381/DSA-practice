public class SplitArray {
    public static void main(String args[])
    {
        int[] nums={7,2,5,10,8};

       int m=2;
        System.out.println(splitArray(nums,m));


    }
    static int splitArray(int[] nums,int m)
    {
       int start=0;
       int end=0;
       for(int i=0;i<nums.length;i++)
       {
       start=Math.max(start,nums[i]);

       end +=nums[i];
       }

       //appl binary search

       while(start<end)
       {
        int mid=start+(end-start)/2;

        int sum=0;
        int pieces=1;
        for(int num:nums)
        {
         if(sum+num>mid)
         {
            //u cannot add this in subarray make it new

            sum=num;
            pieces++;
         }
         else{
            Sum+=num;
            }

        }
        
        if(pieces>m)
        {
            start=mid+1;
        }
        else{
            end=mid;
        }
        
       }
       return end; //start==end

    }
    
}
