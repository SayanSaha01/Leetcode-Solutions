/*class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        return recursion(nums,n-1);    //we pass n-1 as we will start traversing from the n-1th element in the nums array
    }
    public int recursion(int[] nums,int n)
    {
        if(n==0)
            return nums[0];

        if(n<0)
            return 0;
        
        int include = nums[n] + recursion(nums,n-2);
        int exclude = 0 + recursion(nums,n-1);
        
        return Math.max(include,exclude);
    }
}*/
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return recursion(nums,n-1,dp);    
//we pass n-1 as we will start traversing from the n-1th element in the nums array
    }
    public int recursion(int[] nums,int n,int[] dp)
    {
        if(n==0)
            return nums[0];

        if(n<0)
            return 0;
        
        if(dp[n]!=-1)
            return dp[n];
        
        int include = nums[n] + recursion(nums,n-2,dp);
        int exclude = 0 + recursion(nums,n-1,dp);
        
        dp[n]= Math.max(include,exclude);
        return dp[n];
    }
}