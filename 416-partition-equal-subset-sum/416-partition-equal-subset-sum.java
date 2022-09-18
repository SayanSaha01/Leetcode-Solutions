class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n = nums.length;
        for(int i:nums)
        {
            sum+=i;
        }
        if(sum%2!=0)       //if the sum isnt even it cant be split into two equal subsets
            return false;
        int target = sum/2;
        Boolean[][] dp = new Boolean[n][target+1];
        return memoization(n-1,target,nums,dp);
    }
    public Boolean memoization(int idx,int target,int[] nums,Boolean[][] dp)
    {
        if(idx==0)         //index reaches first element from end
            return nums[idx]==target;
        if(target==0)
            return true;
        if(dp[idx][target]!=null)
            return dp[idx][target];
        Boolean nottake = memoization(idx-1,target,nums,dp);
        Boolean take = false;
        if(nums[idx]<=target)
            take = memoization(idx-1,target-nums[idx],nums,dp);
        return dp[idx][target] = nottake||take;
    }
}