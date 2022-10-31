class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        
        for(int i=0;i<m;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        
        for(int i=0;i<n;i++)
        {
            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
        }
        
        int index=0;
        for(int key:map.keySet())
        {
            for(int i=0;i<map.get(key);i++)
            {
                nums1[index++]=key;
            }
        }
    }
}