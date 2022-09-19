/*
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        return recursion(n-1,amount,coins);
    }
    public int recursion(int idx,int amount,int[] coins)
    {
        if(idx==0)
        {
            if(amount%coins[0]==0)
                return amount%coins[0]==0?1:0;
        }
        int nottake = recursion(idx-1,amount,coins);
        int take = 0;
        if(amount>=coins[idx])
            take = recursion(idx,amount-coins[idx],coins);
        return take+nottake;
    }
}
*/
class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n][amount+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(n-1,amount,coins,dp);
    }
    public int recursion(int idx,int amount,int[] coins,int[][] dp)
    {
        if(idx==0)
        {
            if(amount%coins[0]==0)
                return 1;
            else
                return 0;
        }
        if(dp[idx][amount]!=-1)
            return dp[idx][amount];
        int nottake = recursion(idx-1,amount,coins,dp);
        int take = 0;
        if(amount>=coins[idx])
            take = recursion(idx,amount-coins[idx],coins,dp);
        return dp[idx][amount] = take+nottake;
    }
}