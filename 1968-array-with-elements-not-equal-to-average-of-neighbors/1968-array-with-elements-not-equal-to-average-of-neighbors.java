class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++)
        {
            int x = nums[i-1];
            int y = nums[i];
            int z = nums[i+1];
            if(x<y && y<z)
            {
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        return nums;
    }
}