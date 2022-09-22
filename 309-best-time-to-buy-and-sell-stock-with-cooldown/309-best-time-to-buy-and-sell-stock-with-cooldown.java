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
        if(idx>=n)
            return 0;
        if(dp[idx][buy]!=-1)
            return dp[idx][buy];
        if(buy==1)
        {
            int take = -prices[idx] + recursion(idx+1,0,prices,n,dp);
            int nottake = 0 + recursion(idx+1,1,prices,n,dp);
            profit = Math.max(take,nottake);
        }
        else    //if we are selling an item
        {
            int sell = prices[idx] + recursion(idx+2,1,prices,n,dp);
//assume there is a case where idx = n-1 so then idx+2 will give idx>n so we apply the base condition idx>=n
            int notsell = 0 + recursion(idx+1,0,prices,n,dp);
            profit = Math.max(sell,notsell);
        }
        return dp[idx][buy] = profit;
    }
}
