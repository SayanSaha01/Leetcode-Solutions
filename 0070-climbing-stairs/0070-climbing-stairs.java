class Solution {
    int[] dp = new int[46];
    public int climbStairs(int n) {
        Arrays.fill(dp,-1);
        return help(0,n);
    }
    public int help(int curr_stair,int n)
    {
        if(curr_stair==n)
            return 1;
        if(curr_stair>n)
            return 0;
        if(dp[curr_stair]!=-1)
            return dp[curr_stair];
        int op1 = help(curr_stair+1,n);
        int op2 = help(curr_stair+2,n);
        return dp[curr_stair]= op1+op2;
    }
}