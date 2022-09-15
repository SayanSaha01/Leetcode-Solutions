/*class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return recursion(nums,n-1);
    }
    public int recursion(int[] nums,int idx)
    {
        if(idx==0)
            return nums[0]; //MATLAB KI HAMNE NUMS[1] NAHI UTHAYA to HUM Nums[0] UTHA SAKTE HAI, else if we had picked nums[1] it would then go to n-2 and index would be -1;
        if(idx<0)
            return 0;
        int ans = nums[idx] + recursion(nums,idx-2);      //this already covers the n==1 case
        int bns = 0 + recursion(nums,idx-1);
        return Math.max(ans,bns);
    }
}*/
//RECURSION => MEMOIZATION
class Solution{
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recursion(nums,n-1,dp);
    }
    public int recursion(int[] nums,int idx,int[] dp)
    {
        if(idx==0)
           return nums[0];
        if(idx<0)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        int include = nums[idx] + recursion(nums,idx-2,dp);
        int exclude = 0 + recursion(nums,idx-1,dp);
        dp[idx] = Math.max(include,exclude);
        return dp[idx];
    }
}