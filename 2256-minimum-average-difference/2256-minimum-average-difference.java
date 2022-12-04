class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0;
        int index=0;
        long prefixsum=0;
        long suffixsum=0;
        int n= nums.length;
        long min = Integer.MAX_VALUE;
        for(int i:nums)
            sum+=i;
        for(int i=0;i<n;i++)
        {
            prefixsum+=nums[i];
            suffixsum=sum-prefixsum;
            long diff=Math.abs(prefixsum/(i+1)-(n-i==1?0:suffixsum/(n-i-1)));
            if(diff<min)
            {
                min=diff;
                index=i;
            }
        }
        return index;
    }
}