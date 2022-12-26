class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int count0=0;
        for(int i:nums)
        {
            if(i==0)
                count0++;
        }
        int pro=1;
        if(count0==0)
        {
            for(int i:nums)
            {
                pro*=i;
            }
            for(int i=0;i<nums.length;i++)
            {
                arr[i]=pro/nums[i];
            }
            return arr;
        }
        if(count0==1)
        {
            for(int i:nums)
            {
                if(i!=0)
                {
                    pro*=i;
                }
            }
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    arr[i]=pro;
                }
                else
                {
                    arr[i]=0;
                }
            }
            return arr;
        }
        else
            return new int[nums.length];
    }
}