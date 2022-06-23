class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum_num=0;
        int sum_arr = 0;
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]==nums[j])
                    arr[0]=nums[i];
        }
        for(int i=1;i<=nums.length;i++)
        {
            sum_num+=i;
            sum_arr+=nums[i-1];
        }
        arr[1]=sum_num-(sum_arr-arr[0]);
        return arr;
    }
}