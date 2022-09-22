/*
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        return recursion(0,1,prices,n,fee);
    }
    public int recursion(int idx,int buy,int[] prices,int n,int fee)
    {
        int profit = 0;
        if(idx==n) 
            return 0;
        if(buy==1)
        {
            int take = -prices[idx] + recursion(idx+1,0,prices,n,fee); 
//as we are picking up a item to sell we need to find the min cp to get max profit
            int nottake = 0 + recursion(idx+1,1,prices,n,fee); 
//we havent yet bought the item as we are exploring all possibilities and in the next instance we may or may not buy so we pass 1 as buy
            profit = Math.max(take,nottake);
        }
        else
        {
            int sell = prices[idx] - fee + recursion(idx+1,1,prices,n,fee); 
//charging fee after a transaction has been completed
            int notsell = 0 + recursion(idx+1,0,prices,n,fee); 
//as we haven't sold the item in this instance, we may or may not sell it in the next instance so we pass 0 as buy and then explore all possibilities
            profit = Math.max(sell,notsell);
        }
        return profit;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(0,1,prices,n,fee,dp);
    }
    public int recursion(int idx,int buy,int[] prices,int n,int fee,int[][] dp)
    {
        int profit = 0;
        if(idx==n) 
            return 0;
        if(dp[idx][buy]!=-1)
            return dp[idx][buy];
        if(buy==1)
        {
            int take = -prices[idx] + recursion(idx+1,0,prices,n,fee,dp); 
            int nottake = 0 + recursion(idx+1,1,prices,n,fee,dp); 
            profit = Math.max(take,nottake);
        }
        else
        {
            int sell = prices[idx] - fee + recursion(idx+1,1,prices,n,fee,dp); 
            int notsell = 0 + recursion(idx+1,0,prices,n,fee,dp); 
            profit = Math.max(sell,notsell);
        }
        return dp[idx][buy] = profit;
    }
}