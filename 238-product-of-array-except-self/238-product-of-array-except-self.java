
//This one is off time complexity 0(n) but will throw error as we cant divide a number by 0
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixsum=1;
        int[] res= new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=prefixsum;;
            prefixsum*=nums[i];
        }
        int suffixsum=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            res[i]*=suffixsum;
            suffixsum*=nums[i];
        }
        return res;
    }
}