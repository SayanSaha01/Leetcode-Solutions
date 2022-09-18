/*
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        int n = nums.length;
        for(int i:nums)
            sum+=i;
        if(sum-target<0 || (sum-target)%2!=0)
            return 0;
        return recursion(n-1,(sum-target)/2,nums);
    }
    public static int recursion(int idx,int target,int[] nums)
    {
        if(idx==0)
        {
           if(target==0 && nums[idx]==0)
              return 2;             
           if(target == nums[idx] || target==0)
              return 1;
           return 0;
        }
        int notpick=recursion(idx-1,target,nums);
        int pick = 0;
        if(nums[idx]<=target)
            pick = recursion(idx-1,target-nums[idx],nums);
        return (pick+notpick);
    }
}
*/

class Solution {
    public int findTargetSumWays(int[] nums, int d) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(sum-d<0 || (sum-d)%2!=0)
            return 0;
        int n = nums.length;
        int target = (sum-d)/2;
        int[][] dp = new int[n][target+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(n-1,target,nums,dp);
    }
    public int recursion(int idx,int target,int[] nums,int[][] dp)
    {
        int mod = (int)Math.pow(10,9)+7;
        if(idx==0)
        {
           if(target==0 && nums[idx]==0)
              return 2;             
           if(target == nums[idx] || target==0)
              return 1;
           return 0;
        }
        if(dp[idx][target]!=-1)
            return dp[idx][target];
        int notpick=recursion(idx-1,target,nums,dp);
        int pick = 0;
        if(nums[idx]<=target)
            pick = recursion(idx-1,target-nums[idx],nums,dp);
        return dp[idx][target]=(pick+notpick)%mod;
    }
}