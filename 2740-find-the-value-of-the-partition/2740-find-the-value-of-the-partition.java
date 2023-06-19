class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int minpartition = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            int maxvalue = nums[i-1];
            int minvalue = nums[i];
            int difference = Math.abs(maxvalue-minvalue);
            minpartition = Math.min(difference,minpartition);
        }
        return minpartition;
    }
}