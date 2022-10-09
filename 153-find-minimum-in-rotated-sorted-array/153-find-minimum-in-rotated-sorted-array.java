class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];
        
        int pivot = findpivot(nums);
        
        if(pivot==-1)
            return nums[0];
        return nums[pivot+1];
    }
    public int findpivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
                return mid;
            if(mid>start && nums[mid]<nums[mid-1])
                return mid-1;
            if(nums[start]>=nums[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}