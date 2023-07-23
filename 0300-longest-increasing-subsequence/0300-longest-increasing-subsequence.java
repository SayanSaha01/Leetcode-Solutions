/*class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        return lis(0,-1,nums,n);
    }
    public int lis(int idx,int prev_idx,int[] nums,int n)
    {
        if(idx==n)
            return 0;
        int len = 0 + lis(idx+1,prev_idx,nums,n); //not take
        if(prev_idx==-1 || nums[idx]>nums[prev_idx])   //take condition
            len = Math.max(len,1+lis(idx+1,idx,nums,n)); //take
        return len;
    }
}*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return lis(0,-1,nums,n,dp);
    }
    public int lis(int idx,int prev_idx,int[] nums,int n,int[][] dp)
    {
        if(idx==n)
            return 0;
        if(dp[idx][prev_idx+1]!=-1)
            return dp[idx][prev_idx+1];
        
        int not_take = 0 + lis(idx+1,prev_idx,nums,n,dp); //not take
        int take=0;
        if(prev_idx==-1 || nums[idx]>nums[prev_idx])   //take condition
            take = 1+lis(idx+1,idx,nums,n,dp);        //take
        return dp[idx][prev_idx+1]=Math.max(take,not_take);
    }
}