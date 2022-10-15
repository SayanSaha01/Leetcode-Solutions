class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int even = 0;
        int odd =1;
        for(int i:nums)
        {
            if(i%2==0)
            {
                arr[even]=i;
                even+=2;
            }
            else
            {
                arr[odd]=i;
                odd+=2;
            }
        }
        return arr;
    }
}