class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int diff = i-nums[i];
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        //finding the total pairs
        long n = nums.length;
        long total_pairs = n*(n-1)/2;
        long good_pairs = 0;
        //now finding the good pairs
        for(int key:map.keySet())
        {
            if(map.get(key)>1)
            {
                long value = map.get(key);
                good_pairs+= value*(value-1)/2;
            }
        }
        return total_pairs-good_pairs;
    }
}