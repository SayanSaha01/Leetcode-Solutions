class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i=0;i<moveFrom.length;i++)
        {
            int old = moveFrom[i];
            int fresh = moveTo[i];
            if(set.contains(old))
            {
                set.remove(old);
                set.add(fresh);
            }
        }
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
}