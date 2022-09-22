class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][k+1];  //why 3 instead of 2 like in case of buy - buy value varies between 0 and 1 but 3 is passed as capacity ranges from 0 to 2 inclusive and as 2 is upper limit so 2+1
        for(int[][] row:dp)
            for(int[] col:row)
                Arrays.fill(col,-1);
        return recursion(0,1,prices,n,k,dp);
    }
    public int recursion(int idx,int buy,int[] prices,int n,int cap,int[][][] dp)
    {
        int profit = 0;
        if(idx==n)
            return 0;
        if(cap==0)
            return 0;
        if(dp[idx][buy][cap]!=-1)
            return dp[idx][buy][cap];
        if(buy==1)
        {
            int take = -prices[idx] + recursion(idx+1,0,prices,n,cap,dp);
            int nottake = 0 + recursion(idx+1,1,prices,n,cap,dp); 
            
            profit = Math.max(take,nottake);
        }
        else
        {
            int sell = prices[idx] + recursion(idx+1,1,prices,n,cap-1,dp);
            int notsell = 0 + recursion(idx+1,0,prices,n,cap,dp);
            profit = Math.max(sell,notsell);
        }
        return dp[idx][buy][cap] = profit;
    }
}