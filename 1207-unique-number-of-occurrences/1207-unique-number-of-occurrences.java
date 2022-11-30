class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet())
        {
            set.add(map.get(i));
        }
        return map.size()==set.size();
    }
}