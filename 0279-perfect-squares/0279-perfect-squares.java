/*class Solution {
    public int numSquares(int n) {
        return recursion(n);
    }
    public int recursion(int n)
    {
        if(n==0)
            return 0;
        int min = n;
        for(int i=1;i*i<=n;i++)
        {
            min = Math.min(min,1+recursion(n-i*i));
        }
        return min;
    }
}*/
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recursion(n,dp);
    }
    public int recursion(int n,int[] dp)
    {
        if(n==0)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        int min = n;
        for(int i=1;i*i<=n;i++)
        {
            min = Math.min(min,1+recursion(n-i*i,dp));
        }
        return dp[n]=min;
    }
}