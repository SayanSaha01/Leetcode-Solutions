class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        int max = 1;
        for(int idx = 0;idx<=n-1;idx++)
        {
            dp[idx]=1;
            count[idx]=1;
            for(int prev = 0;prev<=idx-1; prev++)
            {
                if(nums[prev] < nums[idx] && 1+dp[prev]>dp[idx])
                {
                    dp[idx] = 1 + dp[prev];
                    count[idx] = count[prev];
                }
                else if(nums[prev] < nums[idx] && 1+dp[prev]==dp[idx])
                {
                    count[idx]+=count[prev];
                }
            }
            max = Math.max(max,dp[idx]);
        }
        int no=0;
        for(int i=0;i<=n-1;i++)
        {
            if(dp[i]==max)
            {
                no+=count[i];
            }
        }
        return no;
    }
}