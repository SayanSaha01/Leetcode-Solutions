class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subset(list,new ArrayList<>(),nums,0);
        return list;
    }
    public void subset(List<List<Integer>> list, List<Integer> inner,int[] nums,int idx)
    {
        list.add(new ArrayList<>(inner));
        for(int i=idx;i<nums.length;i++)
        {
            inner.add(nums[i]);
            subset(list,inner,nums,i+1);
            inner.remove(inner.size()-1);
        }
    }
}