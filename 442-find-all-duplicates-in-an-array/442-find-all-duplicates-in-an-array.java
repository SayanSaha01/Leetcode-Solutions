class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> count = new ArrayList<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int j:map.keySet())
        {
            if(map.get(j)==2)
                count.add(j);
        }
        return count;
    }
}