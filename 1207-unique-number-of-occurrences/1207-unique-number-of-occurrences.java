class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> val = new HashSet<Integer>();
        HashSet<Integer> freq = new HashSet<Integer>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            val.add(i);
        }
        for(int j:map.values())
        {
            freq.add(j);
        }
        return (val.size()==freq.size())?true:false;
    }
}