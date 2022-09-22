/*
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        return recursion(0,1,prices,n,2);
    }
    public int recursion(int idx,int buy,int[] prices,int n,int cap)
    {
        int profit = 0;
        if(idx==n)
            return 0;
        if(cap==0)
            return 0;
        if(buy==1)
        {
            //as we still havent completed a pair of buy and sell cap remains the same, once we sell it then cap decreases by 1
            int take = -prices[idx] + recursion(idx+1,0,prices,n,cap);//as we have bought, in the next take we cant buy consecutively hence we pass 0
            int nottake = 0 + recursion(idx+1,1,prices,n,cap); 
            
            profit = Math.max(take,nottake);
//as i didnt buy, i can buy in the future hence 1 indicates that i need to buy is passed as parameter
        }
        else
        {
            int sell = prices[idx] + recursion(idx+1,1,prices,n,cap-1);// as we tend to sell the item, then in the next take we should buy an item so we increase the index by 1 and pass 1 as buy parameter in function whichindicates we need to buy in future and decrease cap by 1 indicating that 1 transaction is completed
            int notsell = 0 + recursion(idx+1,0,prices,n,cap);
            // we may not sell the item as the price may be too low, then as we are not selling it we dont get any money hence 0+in recursion,we go to the next element and in the next take as we need to sell we pass 0 again, also as one trnasaction is not yet completed, we dont decrease the cap
            profit = Math.max(sell,notsell);
        }
        return profit;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] dp = new int[n][2][3];
        for(int[][] row:dp)
            for(int[] col:row)
                Arrays.fill(col,-1);
        return recursion(0,1,prices,n,2,dp);
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