class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int keys:map.keySet())
        {
            if(map.get(keys)>nums.length/3)
            {
                list.add(keys);
            }
        }
        return list;
    }
}