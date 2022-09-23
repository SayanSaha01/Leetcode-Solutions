class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
//prev_idx in recursion ranged from -1,0,1,2.......n-1; but in dp[-1] is not possible so we shft index and replace by n+1
        int[][] dp  = new int[n][n+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(0,-1,n,nums,dp);
    }
    public int recursion(int idx,int prev_idx,int n,int[] nums,int[][] dp)
    {
        int max=0;
        if(idx==n)
            return 0;
        if(dp[idx][prev_idx+1]!=-1)
            return dp[idx][prev_idx+1];
        int nottake = 0 + recursion(idx+1,prev_idx,n,nums,dp);
        int take = 0;
        if(prev_idx==-1 || nums[idx]>nums[prev_idx])
        {
            take = 1 + recursion(idx+1,idx,n,nums,dp);
        }
        return dp[idx][prev_idx+1] = Math.max(take,nottake);
    }
}