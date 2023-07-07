class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt0=0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==1)
                cnt1++;
        }
        if(cnt1==n)
            return cnt1-1;
        cnt1=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(cnt0>1)
                    break;
                if(nums[j]==1)
                    cnt1++;
                else if(nums[j]==0)
                    cnt0++;
            }
            max=Math.max(max,cnt1);
            cnt0=0;
            cnt1=0;
        }
        return max;
    }
}