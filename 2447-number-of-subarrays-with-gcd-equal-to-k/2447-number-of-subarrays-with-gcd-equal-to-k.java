//Time Complexity - 0(n^2)
class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        // consider every element as a starting point 
        for(int i=0;i<nums.length;i++)
        {
         // since gcd of nums[i] is nums[i] itself we initialize curr_gcd with 0 
            int curr_gcd=0;
         // from the given point try all the subarrays 
            for(int j=i;j<nums.length;j++)
            {
                // keep updating the curr_gcd
                curr_gcd=gcd(nums[j],curr_gcd);
                if(curr_gcd==k)
                    count++;
            }
        }
        return count;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}