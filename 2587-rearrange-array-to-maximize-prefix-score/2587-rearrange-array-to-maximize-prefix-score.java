class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        long sum = 0;
        for(int i=nums.length-1;i>=0;i--)
        {
            sum+=nums[i];
            if(sum>0)
                count++;
            else
                break;
        }
        return count;
    }
}