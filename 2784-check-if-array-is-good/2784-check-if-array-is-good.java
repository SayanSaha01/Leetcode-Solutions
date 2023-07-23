class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return nums[n]==n && nums[n-1]==n?true:false;
    }
}