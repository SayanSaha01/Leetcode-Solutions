class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        solve(set,list,0,nums);
        return new ArrayList<>(set);
    }
    public void solve(Set<List<Integer>> set, List<Integer> list, int idx, int[] nums)
    {
        if(idx==nums.length)
        {
            set.add(new ArrayList<>(list));
            return;
        }
        
        //include
        list.add(nums[idx]);
        solve(set,list,idx+1,nums);
        
        //exclude
        list.remove(list.size()-1);
        solve(set,list,idx+1,nums);
    }
}