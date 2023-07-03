class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> inner = new ArrayList<>();
        subset(list,inner,nums,0);
        return list;
    }
    public void subset(List<List<Integer>> list,List<Integer> inner,int[] nums,int idx)
    {
        list.add(new ArrayList<>(inner));
        for(int i=idx;i<nums.length;i++)
        {
            if(i>idx && nums[i]==nums[i-1])
                continue;
            inner.add(nums[i]);
            subset(list,inner,nums,i+1);
            inner.remove(inner.size()-1);
        }
    }
}