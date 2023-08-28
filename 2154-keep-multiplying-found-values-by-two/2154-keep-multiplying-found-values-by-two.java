class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        while(set.size()!=0)
        {
            if(set.contains(original))
            {
                set.remove(original);
                original*=2;
            }
            else if(!set.contains(original))
            {
                break;
            }
        }
        return original;
    }
}