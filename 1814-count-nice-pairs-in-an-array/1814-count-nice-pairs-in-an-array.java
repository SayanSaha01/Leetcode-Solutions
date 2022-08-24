class Solution {
    public int countNicePairs(int[] nums) {
        int mod = (int)Math.pow(10,9)+7;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]-=reverse(nums[i]);
            int count = map.getOrDefault(nums[i],0);
            res = (res + count)%mod;
            map.put(nums[i],count+1);
        }
        return res;
    }
    private static int reverse(int num)
        {
            int rev=0;
            while(num!=0)
            {
                rev = rev*10+num%10;
                num/=10;
            }
            return rev;
        }
}