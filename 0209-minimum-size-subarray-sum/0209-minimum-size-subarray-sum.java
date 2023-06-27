class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0;
        int min = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(sum<target) //*Checking status of sum*
                    j++; 
            else if(sum>=target){
                 while(sum>=target){  //*Removing element and also calculating size of window*
                    sum-=nums[i];
                    min = Math.min(j-i+1, min);
                    i++;
                }
                j++; 
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}