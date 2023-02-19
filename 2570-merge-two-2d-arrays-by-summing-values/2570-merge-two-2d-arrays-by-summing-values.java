class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>((a,b)->a-b);
        for(int[] arr:nums1)
        {
            map.put(arr[0],map.getOrDefault(arr[0],0)+arr[1]);
        }
        for(int[] arr2:nums2)
        {
            map.put(arr2[0],map.getOrDefault(arr2[0],0)+arr2[1]);
        }
        int[][] new_arr = new int[map.size()][2];
        int j=0;
        for(int i:map.keySet())
        {
            new_arr[j++]=new int[]{i,map.get(i)};
        }
        return new_arr;
    }
}