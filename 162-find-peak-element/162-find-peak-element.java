class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length<1)
            return -1;
        if(nums.length==1)
            return 0;
        
        //checking for the last element
        if(nums[0]>nums[1])
            return 0;
        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        
        int start = 1;
        int end = nums.length-2;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            
            if(nums[mid] > nums[mid-1] && nums[mid] >nums[mid+1])
                return mid;
            else if(nums[mid+1]>nums[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}