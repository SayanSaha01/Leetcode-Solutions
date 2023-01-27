class Solution {
    public int subsetXORSum(int[] nums) {
        return recursion(nums,0,0); //array,start index,current xor
    }
    public int recursion(int[] nums,int idx,int currxor)
    {
        if(idx==nums.length)
            return currxor;
        int takeelement = recursion(nums,idx+1,currxor^nums[idx]);
        int withoutelement = recursion(nums,idx+1,currxor);
        return takeelement+withoutelement;
    }
}