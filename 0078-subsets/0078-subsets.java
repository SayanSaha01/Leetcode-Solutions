class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        subset(list,inner,nums,0);
        return list;
    }
    public void subset(List<List<Integer>> list,List<Integer> inner,int[] nums,int idx)
    {
        if(idx>=nums.length)
        {
            list.add(new ArrayList<>(inner));
            return;
        }
        
        //pick
        inner.add(nums[idx]);
        subset(list,inner,nums,idx+1);
        
        //not pick
        inner.remove(inner.size()-1);
        subset(list,inner,nums,idx+1);
    }
}