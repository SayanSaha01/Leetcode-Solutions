/*class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        return recursion(0,1,prices,n);
    }
    public int recursion(int idx,int buy,int[] prices,int n)
    {
        //buy-1, not buy - 0
        int profit = 0;
        if(idx==n)
            return 0;
        if(buy==1)     //we are buying items so money will go from our pocket hence we subtract -prices[i], classic problem of take/nottake
        {
            profit = Math.max(
                -prices[idx] + recursion(idx+1,0,prices,n),   //if we buy the item at idx then we spend prices[idx] from our end and then end idx+1,as we have bought an item hence we have to sell it before buying another item as it is mentioned You can only hold at most one share of the stock at any time, hence we pass 0 as buy parameter  
                0 + recursion(idx+1,1,prices,n));
            //here in this case we are not buying the element at idx, so we increment idx+1 and as we are not buying anything for the funct
            int take = -prices[idx] + recursion(idx+1,0,prices,n);
            int nottake = 0 + recursion(idx+1,1,prices,n);
            profit = Math.max(take,nottake);
        }
        else    //if we are selling an item
        {
            int sell = prices[idx] + recursion(idx+1,1,prices,n);
            int notsell = 0 + recursion(idx+1,0,prices,n);
            profit = Math.max(sell,notsell);
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
            int take = -prices[idx] + recursion(idx+1,0,prices,n,dp);
            int nottake = 0 + recursion(idx+1,1,prices,n,dp);
            profit = Math.max(take,nottake);
        }
        else    //if we are selling an item
        {
            int sell = prices[idx] + recursion(idx+1,1,prices,n,dp);
            int notsell = 0 + recursion(idx+1,0,prices,n,dp);
            profit = Math.max(sell,notsell);
        }
        return dp[idx][buy] = profit;
    }
}
