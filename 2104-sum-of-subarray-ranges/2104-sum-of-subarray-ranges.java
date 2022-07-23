class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int max = nums[i];
            int min = nums[i];
            for(int j=i;j<nums.length;j++)
            {
                max=Math.max(nums[j],max);
                min = Math.min(nums[j],min);
                sum+=Math.abs(max-min);
            }
        }
        return sum;
    }
}