/*
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return max_sum(nums,0);
    }
    public int max_sum(int[] nums,int idx)
    {
        if(idx==nums.length-1)
            return nums[idx];
        if(idx>nums.length-1)
            return 0;
        int include = max_sum(nums,idx+2) + nums[idx];
        int exclude = max_sum(nums,idx+1) + 0;
        return Math.max(include,exclude);
    }
}
*/

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return max_sum(nums,0,dp);
    }
    public int max_sum(int[] nums,int idx,int[] dp)
    {
        if(idx==nums.length-1)
            return nums[idx];
        if(idx>nums.length-1)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int include = max_sum(nums,idx+2,dp) + nums[idx];
        int exclude = max_sum(nums,idx+1,dp) + 0;
        return dp[idx] = Math.max(include,exclude);
    }
}

