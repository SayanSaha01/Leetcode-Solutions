/*class Solution {
    public int coinChange(int[] coins, int amount) {
        int res = help(coins,amount);
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int help(int[] coins,int amount)
    {
        if(amount==0)
            return 0;
        if(amount<0)
            return Integer.MAX_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int ans = help(coins,amount-coins[i]);
            if(ans!=Integer.MAX_VALUE)
            {
                mini = Math.min(mini,1+ans);
            }
        }
        return mini;
    }
}*/

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int res = help(coins,amount,dp);
        return res==Integer.MAX_VALUE?-1:res;
    }
    public int help(int[] coins,int amount,int[] dp)
    {
        if(amount==0)
            return 0;
        if(amount<0)
            return Integer.MAX_VALUE;
        if(dp[amount]!=-1)
            return dp[amount];
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int ans = help(coins,amount-coins[i],dp);
            if(ans!=Integer.MAX_VALUE)
            {
                mini = Math.min(mini,1+ans);
            }
        }
        return dp[amount]=mini;
    }
}