class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i:nums)
        {
            if(list.contains(i) || i==val)
            {
                continue;
            }
            else
            {
                list.add(i);
            }
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index=0;
        for(int i=0;i<list.size();i++)
        {
            int count = map.get(list.get(i));
            while(count-->0)
            {
                nums[index++]=list.get(i);
            }
        }
        return index;
    }
}