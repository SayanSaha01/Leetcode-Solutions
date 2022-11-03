class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[n*2];
        int index=0;
        for(int i=0;i<n;i++)
        {
            nums2[index++]=nums[i];
            nums2[index++]=nums[i+n];
        }
        return nums2;
    }
}