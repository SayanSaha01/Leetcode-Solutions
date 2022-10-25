class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum += nums[i];
            max = Math.max(currsum,max);
            if(currsum<0)
               currsum=0;
        }
        return max;
    }
}