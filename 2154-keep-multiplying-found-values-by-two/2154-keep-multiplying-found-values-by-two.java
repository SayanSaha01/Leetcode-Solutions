class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums)
        {
            set.add(i);
        }
        while(set.contains(original))
        {
            original*=2;
        }
        return original;
    }
}