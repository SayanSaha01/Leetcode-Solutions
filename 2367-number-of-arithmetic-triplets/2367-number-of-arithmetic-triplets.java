//nums[j] - nums[i] == diff => nums[j] = nums[i] + diff
//nums[k] - nums[j] == diff => nums[k] - nums[j] = diff 
//=> nums[k] - nums[i] = 2*diff

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n:nums)
        {
            if(set.contains(n-diff) && set.contains(n-2*diff))
            {
                count++;
            }
            set.add(n);
        }
        return count;
    }
}