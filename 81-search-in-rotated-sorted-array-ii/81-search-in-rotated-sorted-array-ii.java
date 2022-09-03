class Solution {
    public boolean search(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        boolean flag=false;
        for(int k:map.keySet())
        {
            if(k==target)
                flag=true;
        }
        if(flag)
            return true;
        else
            return false;
    }
}