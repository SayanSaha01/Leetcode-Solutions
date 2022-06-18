class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int currsum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum-=nums[i];
            if(sum==currsum)
                return i;
            currsum+=nums[i];
        }
        return -1;
    }
}