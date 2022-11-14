class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer,Integer> treemap = new TreeMap<Integer,Integer>();
        for(int i:nums)
        {
            //storing in treemap based on frequency
            treemap.put(i,treemap.getOrDefault(i,0)+1);
        }
        while(treemap.size()!=0)
        {
            int val = treemap.firstKey();
            for(int i=val;i<val+k;i++)  //val+k will be our window size
            {
                if(!treemap.containsKey(i))  //if map dose not contain consecutive number within window
                {
                    return false;
                }
                else
                {
                    treemap.put(i,treemap.get(i)-1);
                    if(treemap.get(i)==0)   //removed completly coz it is now used in above set
                        treemap.remove(i);
                }
            }
        }
        return true;
    }
}