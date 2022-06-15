class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(countdigit(nums[i])%2==0)
            {
                count+=1;
            }
        }
        return count;
        
    }
    public int countdigit(int num)
    {
        int co=0;
        while(num>0)
        {
            num=num/10;
            co+=1;
        }
        return co;
    }
}