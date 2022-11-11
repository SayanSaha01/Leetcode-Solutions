class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        long max=0;
        long sum=0;
        for(int j=0;j<nums.length;j++)
        {
            sum += nums[j];
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            if(j>=k-1)
            {
                if(map.size()==k)
                    max = Math.max(max,sum);
                
                sum -= nums[j-k+1];
                map.put(nums[j-k+1],map.get(nums[j-k+1])-1);
                if(map.get(nums[j-k+1])==0)
                   map.remove(nums[j-k+1]);
            }
        }
        return max;
    }
}