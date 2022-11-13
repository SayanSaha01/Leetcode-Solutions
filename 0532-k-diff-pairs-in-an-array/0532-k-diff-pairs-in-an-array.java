class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0)
            return 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashSet<Integer> repeat = new HashSet<Integer>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res=0;
        if(k==0)
        {
            for(int n : map.keySet())
            {
                if(map.get(n)>1)
                {
                    res++;
                }
            }
        }
        else
        {
            for(int n:map.keySet())
            {
                if(map.containsKey(n+k))
                {
                    res++;
                }
            }
        }
        return res;
    }
}