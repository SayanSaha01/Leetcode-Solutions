class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,nums,new ArrayList<>());
        return list;
    }
    public void backtrack(List<List<Integer>> list, int[] nums,List<Integer> tl)
    {
        if(tl.size()==nums.length)
        {
            list.add(new ArrayList<>(tl));
            return;
        }
        for(int i:nums)
        {
            if(tl.contains(i))
            {
                continue;
            }
            else
            {
                tl.add(i);
                backtrack(list,nums,tl);
                tl.remove(tl.size()-1);
            }
        }
    }
}