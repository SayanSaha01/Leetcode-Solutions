class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer,Integer> treemap = new TreeMap<Integer,Integer>();
        for(int i:nums)
        {
            treemap.put(i,treemap.getOrDefault(i,0)+1);
        }
        while(treemap.size()!=0)
        {
            int val = treemap.firstKey();
            for(int i=val;i<val+k;i++)
            {
                if(!treemap.containsKey(i))
                {
                    return false;
                }
                else
                {
                    treemap.put(i,treemap.get(i)-1);
                    if(treemap.get(i)==0)
                        treemap.remove(i);
                }
            }
        }
        return true;
    }
}