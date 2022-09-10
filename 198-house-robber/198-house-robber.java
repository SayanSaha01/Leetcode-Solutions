// Recursive Approach (Gives TLE)
/*class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int ans = recursion(nums,n-1);
        return ans;
    }
    public static int recursion(int[] nums,int n)
    {
        if(n<0)
            return 0;
        if(n==0)
            return nums[0];
        
        int include = recursion(nums,n-2)+nums[n];   
        int exclude = recursion(nums,n-1)+0;
        
//[1,2,3,1] => exclude is for the elements other than n-2 that is pairing of 1 with 1, 1 initially adds with 3 but if we exclude 3 we come to 1 which is also a non adjacent element

        return Math.max(include,exclude);
    }
}*/

//Recursion + Memoization (Also gives TLE)
/*class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];     //step1
        Arrays.fill(dp,-1);
        int ans = memoization(nums,n-1,dp);
        return ans;
    }
    public static int memoization(int[] nums,int n,int[] dp)
    {
        if(n<0)
            return 0;
        
        if(n==0)
            return nums[0];
        
        if(dp[n]!=-1)                //step 3
            return dp[n];
        
        int include = memoization(nums,n-2,dp)+nums[n];
        int exclude = memoization(nums,n-1,dp)+0;
        
        dp[n] = Math.max(include,exclude);    //step2
        return dp[n];
    }
}*/

/* Tabulation
class Solution {
    public int rob(int[] nums) {
        return tabulation(nums);
    }
    public static int tabulation(int[] nums)
    {
        if(nums.length==0)
            return 0;
        
        if(nums.length==1)
            return nums[0];
        
        int n = nums.length;
        int[] dp = new int[n+1];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1],dp[0]);  /*we are getting this idea from the formula                 => Math.max(include,exclude) 
        => Math.max(dp[i-2] + nums[i],dp[i-1]);
        we are trying to find out the value of dp[i] where i=1 hence dp[i-2] doesnt exist hence we assume it to be zero 
        =>dp[i] (i=1) = Math.max(nums[1],dp[0]);
        
        for(int i=2;i<n;i++)
        {
            int include = dp[i-2] + nums[i];
            int exclude = dp[i-1] + 0;
            dp[i] = Math.max(include,exclude);
        }
        return dp[n-1];
    }
}
*/

//Space Optimised
class Solution {
    public int rob(int[] nums) {
        return optimised(nums);
    }
    public static int optimised(int[] nums)
    {
        int n=nums.length;
        
        int prev2=0;            //these values are obtained by looking at memoization  
        int prev1=nums[0];
        
        for(int i=1;i<n;i++)
        {
            int incl = prev2 + nums[i];
            int excl = prev1 + 0;
            
            int ans = Math.max(incl,excl);
            prev2=prev1;
            prev1=ans;
        }
        return prev1;
    }
}