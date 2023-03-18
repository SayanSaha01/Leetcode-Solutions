class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        
        int small = nums[0];
        int large = nums[nums.length-1];
        
        int count=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]>small && nums[i]<large)
            {
                count++;
            }
        }
        return count;
    }
}