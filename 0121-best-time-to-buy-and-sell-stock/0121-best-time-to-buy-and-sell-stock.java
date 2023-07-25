/* //Brute Force
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++)
        {
            int buy = prices[i];
            for(int j=i+1;j<prices.length;j++)
            {
                int sell = prices[j];
                max = Math.max(sell-buy,max);
            }
        }
        return max;
    }
}
*/
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int cost_price = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            int profit = prices[i]-cost_price;
            max_profit=Math.max(profit,max_profit);
            cost_price= Math.min(cost_price,prices[i]);
        }
        return max_profit;
    }
}