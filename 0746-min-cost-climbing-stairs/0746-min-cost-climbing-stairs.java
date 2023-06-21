/*
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int op1 = mincost(0,cost);
        int op2 = mincost(1,cost);
        return Math.min(op1,op2);
    }
    public int mincost(int idx,int[] cost)
    {
        int n = cost.length;
        if(idx>cost.length)
            return 0;
        if(idx==n-1 || idx==n-2)
            return cost[idx];
        return cost[idx] + Math.min(mincost(idx+1,cost),mincost(idx+2,cost));
    }
}*/
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        
        int op1 = mincost(0,cost,dp);
        int op2 = mincost(1,cost,dp);
        
        return Math.min(op1,op2);
    }
    public int mincost(int idx,int[] cost,int[] dp)
    {
        int n = cost.length;
        if(idx>cost.length)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        if(idx==n-1 || idx==n-2)
            return cost[idx];
        return dp[idx]=cost[idx] + Math.min(mincost(idx+1,cost,dp),mincost(idx+2,cost,dp));
    }
}