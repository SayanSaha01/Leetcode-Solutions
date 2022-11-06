class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        max=sum/k;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
            max=Math.max(sum/k,max);
        }
        return max;
    }
}