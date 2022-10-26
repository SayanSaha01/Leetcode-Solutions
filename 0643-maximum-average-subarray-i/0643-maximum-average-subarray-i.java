/*
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        int n = nums.length;
        if(n==1)
            return (double)nums[0]/k;
        for(int i=0;i<=n-k;i++)
        {
            double sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum+=nums[j];
            }
            max = Math.max(sum/k,max);
        }
        return max;
    }
}
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        long max=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+= nums[i]-nums[i-k];
            max = Math.max(sum,max);
        }
        return ((double) max) / ((double) k);
    }
}