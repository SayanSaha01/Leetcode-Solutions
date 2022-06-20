class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int less=0;
        int equal=0;
        int great=0;
        int[] low = new int[nums.length];
        int[] eq = new int[nums.length];
        int[] greater = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                low[less]=nums[i];
                less++;
            }
            if(nums[i]==pivot)
            {
                eq[equal] = nums[i];
                equal++;
            }
            if(nums[i]>pivot)
            {
                greater[great] = nums[i];
                great++;
            }
        }
        for(int i=0;i<less;i++)
        {
            nums[i]=low[i];
        }
        for(int i=0;i<equal;i++)
        {
            nums[less+i]=eq[i];
        }
        for(int i=0;i<great;i++)
        {
            nums[equal+less+i]=greater[i];
        }
        return nums;
    }
}