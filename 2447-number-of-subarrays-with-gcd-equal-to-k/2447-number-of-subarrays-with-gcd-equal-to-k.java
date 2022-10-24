class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr_gcd=0;
            for(int j=i;j<nums.length;j++)
            {
                curr_gcd=gcd(curr_gcd,nums[j]);
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