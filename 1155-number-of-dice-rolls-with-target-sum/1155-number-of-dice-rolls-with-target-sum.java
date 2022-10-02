/*
class Solution {
    static int MOD = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        return target(n,k,target);
    }
    public int target(int n,int k,int target)
    {
        if(n==0 || target<0)            //if n==0, means we have extinguished all the possible ways and if in such case if the target is 0 then we return 1,as it indicates a possible way. We are also exploring the option if target<0 and in all other cases  we return 0 
            return target==0?1:0;
        int ways=0;
        for(int i=1;i<=k;i++)    //since k denotes the number appearing on the face of the dice, we will be iterating the loop from 1 to k that is figuring out all the possible sum combinations that render the target
        {
            ways+=target(n-1,k,target-i)%MOD;
        }
        return ways;
    }
}
*/
class Solution {
    static int MOD = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return target(n,k,target,dp);
    }
    public int target(int n,int k,int target,int[][] dp)
    {
        if(n==0 || target<0) 
            return target==0?1:0;
        if(dp[n][target]!=-1)
            return dp[n][target];
        int ways=0;
        for(int i=1;i<=k;i++)
        {
            ways+=target(n-1,k,target-i,dp);
            ways=ways%MOD;
        }
        return dp[n][target]=ways;
    }
}