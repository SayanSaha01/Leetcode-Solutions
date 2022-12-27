class Solution {
    public boolean canJump(int[] nums) {
        int max_reach_idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i > max_reach_idx)
                return false;
            max_reach_idx = Math.max(i+nums[i],max_reach_idx);
        }
        return true;
    }
}