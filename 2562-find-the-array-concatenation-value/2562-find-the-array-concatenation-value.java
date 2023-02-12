class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum=0;
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            if(i==j && nums.length%2!=0)
            {
                sum+=nums[i];
                i++;
                j--;
            }
            else
            {
                String str = new String(nums[i]+""+nums[j]);
                sum+=Integer.valueOf(str);
                i++;
                j--;
            }
        }
        return sum;
        
    }
}