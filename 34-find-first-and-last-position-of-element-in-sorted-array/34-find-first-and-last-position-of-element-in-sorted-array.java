class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0]=first(nums,target);
        result[1]=last(nums,target);
        return result;
    }
    public int first(int[] nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        int idx = -1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else
            {
                if(mid==0||nums[mid]!=nums[mid-1])
                    return idx=mid;
                else
                    end=mid-1;
            }
        }
        return idx;
    }
    public int last(int[] nums,int target)
    {
        int start = 0;
        int end = nums.length-1;
        int idx = -1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else
            {
                if(mid==nums.length-1||nums[mid]!=nums[mid+1])
                    return idx=mid;
                else
                    start = mid+1;
            }
        }
        return idx;
    }
}