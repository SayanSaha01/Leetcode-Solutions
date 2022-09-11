/*RECURSION
class Solution {
    public int combinationSum4(int[] nums, int target) {
        return combination(nums,target);
    }
    public int combination(int[] nums,int target)
    {
        if(target<0) 
            return 0;
        if(target==0) 
            return 1;
        int sum=0;
        for(int num:nums)
            sum+=combinationSum4(nums,target-num);
        return sum; 
    }
}
*/
//RECURSION => MEMOIZATION
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp,-1);
        return memoization(nums,target,dp);
    }
    public int memoization(int[] nums,int target,int[] dp)
    {
        if(target<0) 
            return 0;
        if(target==0) 
            return 1;
        if(dp[target]!=-1)
        {
            return dp[target];
        }
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans+=memoization(nums,target-nums[i],dp);
        }
        dp[target] = ans;
        return dp[target];
    }
}