class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] nums2 = Arrays.copyOf(nums, nums.length);
        int n = nums.length-1;
        for(int i=1;i<nums.length;i+=2)
        {
            nums[i]=nums2[n--];
        }
        for(int i=0;i<nums.length;i+=2)
        {
            nums[i]=nums2[n--];
        }
    }
}