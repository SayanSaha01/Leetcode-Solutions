/*
class Solution {
    int min = Integer.MAX_VALUE;
    public int numSquares(int n) {
        return lps(n);
    }
    private int lps(int n)
    {
        if(n==0)
            return 0;
        for(int i=1;i*i<=n;i++)
        {
            min=Math.min(min,1+lps(n-i*i));
        }
        return min;
    }
}
*/
class Solution {
    int min = Integer.MAX_VALUE;
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return lps(n,dp);
    }
    private int lps(int n,int[] dp)
    {
        if(n==0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        for(int i=1;i*i<=n;i++)
        {
            min=Math.min(min,1+lps(n-i*i,dp));
        }
        return dp[n]=min;
    }
}