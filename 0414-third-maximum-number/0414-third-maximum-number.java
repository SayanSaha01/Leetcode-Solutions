class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeset = new TreeSet<Integer>(Collections.reverseOrder());
        for(int i:nums)
        {
            treeset.add(i);
        }
        if(treeset.size()>=3)
        {
            treeset.pollFirst();
            treeset.pollFirst();
        }
        return treeset.first();
    }
}