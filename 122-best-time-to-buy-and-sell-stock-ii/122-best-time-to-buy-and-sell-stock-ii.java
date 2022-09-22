/*
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        return recursion(0,1,prices,n);
    }
    public int recursion(int idx,int buy,int[] prices,int n)
    {
        int profit = 0;
        if(idx==n)
            return 0;
        if(buy==1)
        {
            profit = Math.max(-prices[idx] + recursion(idx+1,0,prices,n),
                              0 + recursion(idx+1,1,prices,n));
        }
        else    //if we are selling an item
        {
            profit = Math.max(prices[idx] + recursion(idx+1,1,prices,n),
                              0 + recursion(idx+1,0,prices,n));
        }
        return profit;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(0,1,prices,n,dp);
    }
    public int recursion(int idx,int buy,int[] prices,int n,int[][] dp)
    {
        int profit = 0;
        if(idx==n)
            return 0;
        if(dp[idx][buy]!=-1)
            return dp[idx][buy];
        if(buy==1)
        {
            dp[idx][buy] = Math.max(-prices[idx] + recursion(idx+1,0,prices,n,dp),
                                    0 + recursion(idx+1,1,prices,n,dp));
        }
        else    //if we are selling an item
        {
            dp[idx][buy] = Math.max(prices[idx] + recursion(idx+1,1,prices,n,dp),
                                    0 + recursion(idx+1,0,prices,n,dp));
        }
        return dp[idx][buy];
    }
}