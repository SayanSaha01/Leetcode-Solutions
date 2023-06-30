class Solution {
    
    public boolean canBeIncreasing(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums)
        {
            list.add(i);
        }
        for(int i=0;i<list.size();i++)
        {
            int num = list.get(i);
            list.remove(i);
            if(increasing(list))
            {
                return true;
            }
            list.add(i,num);
        }
        return false;
    }
    public boolean increasing(List<Integer> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)<list.get(i+1))
                continue;
            else
                return false;
        }
        return true;
    }
}