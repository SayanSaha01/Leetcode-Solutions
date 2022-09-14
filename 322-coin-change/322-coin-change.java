/*class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int ans = solve(coins,amount);
        return ans==Integer.MAX_VALUE?-1:ans;
            
    }
    public static int solve(int[] coins,int amount)
    {
        
        if(amount==0)
            return 0;
        if(amount<0)
            return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int sum = solve(coins,amount-coins[i]);
            if(sum!=Integer.MAX_VALUE)
            {
                min = Math.min(min,1+sum);
            }
        }
        return min;
    }
}
*/
/*
class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = solve(coins,amount,dp);
        return ans==Integer.MAX_VALUE?-1:ans;    
    }
    public static int solve(int[] coins,int amount,int[] dp)
    {
        if(amount==0)
            return 0;
        if(amount<0)
            return Integer.MAX_VALUE;
        if(dp[amount]!=-1)
            return dp[amount];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
            int sum = solve(coins,amount-coins[i],dp);
            if(sum!=Integer.MAX_VALUE)
            {
                min = Math.min(min,1+sum);
            }
        }
        dp[amount]=min;
        return dp[amount];
    }
}*/
class Solution {
    public int coinChange(int[] coins, int amount) 
    {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<=amount;i++)
        {
            for(int j=0;j<coins.length;j++)
            {
                if(i-coins[j]>=0 && dp[i-coins[j]]!=Integer.MAX_VALUE)
                {
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}