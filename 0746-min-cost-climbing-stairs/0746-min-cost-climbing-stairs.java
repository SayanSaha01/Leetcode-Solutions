// refer this for clear understanding - https://www.youtube.com/watch?v=teVZX760hDA

/*class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int op1 = help(0,cost);
        int op2 = help(1,cost);
        return Math.min(op1,op2);
    }
    public int help(int curr_stair,int[] cost)
    {
        if(curr_stair>=cost.length)
            return 0;
        int total = cost[curr_stair];
        int op1 = help(curr_stair+1,cost);
        int op2 = help(curr_stair+2,cost);
        total=Math.min(op1,op2);
        return total;
    }
}*/

class Solution {
    int[] dp = new int[1001];
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp,-1);
        int op1 = help(0,cost);
        int op2 = help(1,cost);
        return Math.min(op1,op2);
    }
    public int help(int curr_stair,int[] cost)
    {
        if(curr_stair>=cost.length)
            return 0;
        if(dp[curr_stair]!=-1)
            return dp[curr_stair];
        int op1 = help(curr_stair+1,cost);
        int op2 = help(curr_stair+2,cost);
        int total=cost[curr_stair]+Math.min(op1,op2);
        return dp[curr_stair]=total;
    }
}