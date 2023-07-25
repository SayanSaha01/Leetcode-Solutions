class Solution {
    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i:nums)
            list.add(i);
        while(k-->0)
        {
            int poll = list.remove(list.size()-1);
            list.add(0,poll);
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        
    }
}