class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        lsum[0]=nums[0];
        rsum[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            lsum[i]=nums[i] + lsum[i-1];
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rsum[i]=nums[i] + rsum[i+1];
        }
        int[] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           answer[i]=Math.abs(lsum[i]-rsum[i]);
        }
        return answer;
    }
    
}