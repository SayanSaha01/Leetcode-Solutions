class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n-k+1;i++)
        {
            min=Math.min(nums[i+k-1]-nums[i],min);
        }
        return min;
    }
}