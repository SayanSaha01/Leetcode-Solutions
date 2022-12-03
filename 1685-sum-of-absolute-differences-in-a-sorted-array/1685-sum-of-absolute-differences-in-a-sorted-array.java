class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefixsum = new int[n];
        int[] suffixsum = new int[n];
        
        for(int i=1;i<n;i++)
        {
            prefixsum[i] = prefixsum[i-1]+nums[i-1];
        }
        
        for(int i=n-2;i>=0;i--)
        {
            suffixsum[i] = suffixsum[i+1]+nums[i+1];
        }
        
        for(int i=0;i<n;i++)
        {
            prefixsum[i] = (i*nums[i])-prefixsum[i]+ suffixsum[i]-nums[i]*(n-1-i);
        }
        return prefixsum;
    }
}