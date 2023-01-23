class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:nums1)
        {
            set.add(i);
        }
        for(int j:nums2)
        {
            if(set.contains(j))
                return j;
        }
        return -1;
    }
}