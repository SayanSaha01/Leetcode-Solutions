class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int[] num:nums)
        {
            for(int i:num)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)==nums.length)
            {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}