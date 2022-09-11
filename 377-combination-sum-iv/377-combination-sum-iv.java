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
/*class Solution {
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
}*/
//TABULATION
class Solution{
    public int combinationSum4(int[] nums,int target)
    {
        int[] dp = new int[target+1];
        dp[0]=1;
        //for target array, consisting of numbers in range(target)
        //traversing from 1 to target
        for(int i=1;i<=target;i++)
        {
//j loop is basically iterating through the nums to achieve the target
//traversing the num array            
            for(int j=0;j<nums.length;j++)
            {
                if(i-nums[j]>=0)
                   dp[i]+=dp[i-nums[j]];   //why dp[i-nums[j]] since i consists of numbers in range(target) and nums[j] consists of numbers which subtracted render the remaining target to be achieved in recursion
            }
        }
        return dp[target];
    }
}