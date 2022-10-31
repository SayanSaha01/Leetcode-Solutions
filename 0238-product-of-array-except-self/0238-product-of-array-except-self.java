/*
Time Complexity - O(n^2) - throws TLE
Space Complexity - O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int pro=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                    continue;
                else
                    pro*=nums[j];                
            }
        }
        return product;
    }
}
*/

/*Method 2 - Counting 0 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
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
                nums[i]=pro/nums[i];
            }
            return nums;
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
                    nums[i]=pro;
                }
                else
                {
                    nums[i]=0;
                }
            }
            return nums;
        }
        else
            return new int[nums.length];
    }
}