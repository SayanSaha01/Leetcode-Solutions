/*class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return recursion(0,nums);
    }
    public int recursion(int idx,int[] nums)
    {
        if(idx==nums.length-1)    //if there is only 1 element
            return nums[idx];
        if(idx>nums.length-1)
            return 0;
        int incl = recursion(idx+2,nums)+nums[idx];
        int excl = recursion(idx+1,nums)+0;
        return Math.max(incl,excl);
    }
}*/
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recursion(0,nums,dp);
    }
    public int recursion(int idx,int[] nums,int[] dp)
    {
        if(idx==nums.length-1)    //if there is only 1 element
            return nums[idx];
        if(idx>nums.length-1)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int incl = recursion(idx+2,nums,dp)+nums[idx];
        int excl = recursion(idx+1,nums,dp)+0;
        return dp[idx]=Math.max(incl,excl);
    }
}