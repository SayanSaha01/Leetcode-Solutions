class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>(), set3 = new HashSet<>(), set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i:nums1)
        {
            set1.add(i);
            set.add(i);
        }
        for(int i:nums2)
        {
            set2.add(i);
            set.add(i);
        }
        for(int i:nums3)
        {
            set3.add(i);
            set.add(i);
        }
        for(int i:set)
        {
            if(set1.contains(i) && set2.contains(i)
            || set2.contains(i) && set3.contains(i) 
            || set3.contains(i) && set1.contains(i))
                result.add(i);
        }
        return result;
    }
}