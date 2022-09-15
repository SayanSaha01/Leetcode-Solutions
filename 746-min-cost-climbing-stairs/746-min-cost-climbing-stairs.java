/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        return Math.min(recursion(cost,n-1),recursion(cost,n-2));
        
    }
    public int recursion(int[] cost,int n)
    {
        if(n==0)
            return cost[0];
        if(n==1)
            return cost[1];
        int ans = cost[n] + Math.min(recursion(cost,n-1),recursion(cost,n-2));
        return ans;
    }
}
*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(recursion(cost,n-1,dp),recursion(cost,n-2,dp));
    }
    public int recursion(int[] cost,int n,int[] dp)
    {
        if(n==0)
            return cost[0];
        if(n==1)
            return cost[1];
        if(dp[n]!=-1)
            return dp[n];
        dp[n] = cost[n] + Math.min(recursion(cost,n-1,dp),recursion(cost,n-2,dp));
        return dp[n];
    }
}