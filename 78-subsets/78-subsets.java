class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerset = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int idx=0;
        solve(powerset,subset,idx,nums);
        return powerset;
    }
    private void solve(List<List<Integer>> powerset,List<Integer> subset,int idx,int[] nums)
    {
        //base case
        if(idx==nums.length)
        {
            powerset.add(new ArrayList<>(subset));
            return;
        }
        
        //include
        subset.add(nums[idx]);
        solve(powerset, subset,idx + 1, nums);
        
        
        //exclude
        subset.remove(subset.size()-1);
        solve(powerset, subset,idx + 1, nums);
        
    }
}