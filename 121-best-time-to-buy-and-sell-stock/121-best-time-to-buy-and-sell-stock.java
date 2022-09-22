class Solution {
    public int maxProfit(int[] prices) {
/*if i am selling the stock on the ith day 
then i need to buy the stock from1st to i-1th day*/
        int costprice = prices[0];
        int max_profit = 0;
//why we dont start from 0,-as we cant buy and sell on the same day
// iterating from i means we take the selling prices one by one we need to decide the min cost values from amongst 1 to i-1 value to maximise the profit
        for(int i=1;i<prices.length;i++)
        {
            int profit = prices[i]-costprice;           //current sp-cp
            max_profit = Math.max(profit,max_profit);   //maximising profit
            costprice = Math.min(costprice,prices[i]);  //we need to take into consideration min cost price to ensure max profit, comparing costprice with prices[i] because as i increase we loop through it's left elements to find the max profit
        }
        return max_profit;
    }
}