class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] odd = new int[nums.length/2];
        int[] even = new int[nums.length/2];
        int ecount=0;
        int ocount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                even[ecount]=nums[i];
                ecount++;
            }
            if(nums[i]%2!=0)
            {
                odd[ocount]=nums[i];
                ocount++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=even[i/2];
            }
            else
            {
                nums[i]=odd[i/2];
            }
        }
        return nums;
    }
}