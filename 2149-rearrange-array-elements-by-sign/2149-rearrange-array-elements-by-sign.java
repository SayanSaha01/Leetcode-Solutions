class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int pcount=0;
        int ncount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos[pcount]=nums[i];
                pcount++;
            }
            if(nums[i]<0)
            {
                neg[ncount]=nums[i];
                ncount++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=pos[i/2];
            }
            else
            {
                nums[i]=neg[i/2];
            }
        }
        return nums;
    }
}