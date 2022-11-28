class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int[] mat:matches)
        {
            map.put(mat[1],map.getOrDefault(mat[1],0)+1);
        }
        List<Integer> onelost = new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                onelost.add(i);
            }
        }
        List<Integer> notlost = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int[] mt:matches)
        {
            if(!map.containsKey(mt[0]))
            {
                set.add(mt[0]);
            }
        }
        for(int a:set)
            notlost.add(a);
        list.add(notlost);
        list.add(onelost);
        return list;
    }
}