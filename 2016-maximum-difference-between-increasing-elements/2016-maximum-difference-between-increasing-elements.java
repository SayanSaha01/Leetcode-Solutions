class Solution {
    public int maximumDifference(int[] prices) {
        int max_profit=0;
        int cost_price = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int profit = prices[i]-cost_price;
            max_profit=Math.max(profit,max_profit);
            cost_price= Math.min(cost_price,prices[i]);
        }
        return max_profit==0?-1:max_profit;
    }
}