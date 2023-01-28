class Solution {
    public int maxProfit(int[] prices) {
        int costprice = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++)
        {
            int profit = prices[i]-costprice;
            maxprofit = Math.max(profit,maxprofit);
            costprice = Math.min(costprice,prices[i]);
        }
        return maxprofit;
    }
}