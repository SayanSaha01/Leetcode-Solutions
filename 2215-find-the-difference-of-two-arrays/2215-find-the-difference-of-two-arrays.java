class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        
        HashSet<Integer> h1 = new HashSet<Integer>();
        HashSet<Integer> h2 = new HashSet<Integer>();
        
        for(int n:nums1)
            h1.add(n);
        
        for(int n:nums2)
            h2.add(n);
        
        List<Integer> unique1 = new ArrayList<Integer>();
        List<Integer> unique2 = new ArrayList<Integer>();
        
        for(int n:h1)
            if(h2.contains(n))
                h2.remove(n);
            else
                unique1.add(n);
        
        for(int n:h2)
            unique2.add(n);
            
        list.add(unique1);
        list.add(unique2);
        
        return list;
    }
}