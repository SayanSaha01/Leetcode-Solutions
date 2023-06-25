class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0;i<n-k+1;i++)
        {
            min=Math.min(nums[i+k-1]-nums[i],min); //as it is asked to find the difference between the highest and the lowest of the k scores and the array is sorted so nums[i+k-1] and nums[i] denote the highest and the lowest score of the kth array
        }
        return min;
    }
}