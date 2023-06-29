class Solution {
    public int maxProfit(int[] prices) {
        int cost_price=prices[0];
        int maxprofit = 0;
        
        for(int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-cost_price;
            maxprofit=Math.max(profit,maxprofit);
            cost_price=Math.min(prices[i],cost_price);
        }
        return maxprofit;
    }
}