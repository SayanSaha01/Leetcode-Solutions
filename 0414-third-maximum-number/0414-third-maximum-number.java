class Solution {
    public int thirdMax(int[] nums) {
    TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        if(set.size()>=3)
        {
            set.pollFirst();
            set.pollFirst();
        }
        return set.first();
    }
}