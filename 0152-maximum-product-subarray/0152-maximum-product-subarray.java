class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++)
        {
            int pro = 1;
            for(int j=i;j<nums.length;j++)
            {
                pro=pro*nums[j];
                max = Math.max(pro,max);
            }
            System.out.print(pro+" ");
            
        }
        return max;
    }
}