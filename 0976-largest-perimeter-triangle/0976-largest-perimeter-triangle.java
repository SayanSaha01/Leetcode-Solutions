class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        //traversing from the back
        for(int i=nums.length-1;i>=2;i--) //why i>=2 as we are checking from the end if the three sides meet the criteria nums[i]>nums[i-1]+nums[i-2] if i>=0 then nums[i-2] will go out of bounds as i cant go -ve
        {
            if(nums[i]<nums[i-1]+nums[i-2])
                return nums[i]+nums[i-1]+nums[i-2];
        }
        return 0;
    }
}