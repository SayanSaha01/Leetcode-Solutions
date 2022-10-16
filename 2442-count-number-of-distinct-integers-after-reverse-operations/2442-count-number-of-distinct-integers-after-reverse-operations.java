class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums)
        {
            set.add(i);
            String s = String.valueOf(i);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            set.add(Integer.parseInt(sb.toString()));
        }
        return set.size();
    }
}