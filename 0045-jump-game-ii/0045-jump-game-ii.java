class Solution {
    public int jump(int[] nums) {
        int currend=0,currfarthest=0,jumps=0;
        for(int i=0;i<nums.length-1;i++)
        {
            currfarthest = Math.max(currfarthest,i+nums[i]);
            if(i==currend)
            {
                jumps++;
                currend=currfarthest;
                
                if(i>=nums.length-1)
                    break;
            }
        }
        return jumps;
    }
}