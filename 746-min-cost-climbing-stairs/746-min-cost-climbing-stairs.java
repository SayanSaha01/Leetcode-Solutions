class Solution {

    public int solve2(int[] cost,int n,int[] dp)
    {
        if(n<0)
            return 0;
        if(n==0||n==1){
           dp[n] = cost[n];
         return dp[n];
        }
        
        //step3
        if(dp[n]>0)
            return dp[n];
        
        // the base cases remain same while converting a recursive solution to dp we need to make changes in the recursive relation
        //step 2
        dp[n] = cost[n]+Math.min(solve2(cost,n-1,dp),solve2(cost,n-2,dp));
        return dp[n];
    }
    
    public int minCostClimbingStairs(int[] cost) {
        //int n = cost.length;
        //return Math.min(solve(cost,n-1),solve(cost,n-2));
        
        //Step 1 while creatinga dp
        
        int n= cost.length;
        int[] dp = new int[n+1];
        return Math.min(solve2(cost,n-1,dp),solve2(cost,n-2,dp));
    }
}