/*
class Solution {
    public int climbStairs(int n) {
        return recursion(n);
    }
    public int recursion(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return recursion(n-1)+recursion(n-2);
    }
}
*/
//RECURSION => MEMOIZATION
/*
class Solution{
    public int climbStairs(int n)
    {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return memoization(n,dp);
    }
    public int memoization(int n,int[] dp)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(dp[n]!=-1)
            return dp[n];
        dp[n]= memoization(n-1,dp) + memoization(n-2,dp);
        return dp[n];
    }
}
*/
//TABULATION
class Solution{
    public int climbStairs(int n)
    {
        if(n==0||n==1||n==2)
            return n;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}