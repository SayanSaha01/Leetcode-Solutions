class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recursion(0,n,dp);  //how many steps we have to traverse and starting index  
    }
    public int recursion(int i,int n,int[] dp)
    {
        if(i==n)   // if we are standing at the 5th step and we have to reach the fifth step only
            return 1;
        if(i>n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        dp[i]=recursion(i+1,n,dp)+recursion(i+2,n,dp);  
        return dp[i];
    }
}