class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();   
        helper(nums , 0, new ArrayList<Integer>() , ans);
        return ans;
    }
    void helper(int nums[],int i,List<Integer> subset,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            ans.add(new ArrayList<>(subset));
            return ;
        }
        
        //pick
        subset.add(nums[i]);
        helper(nums, i + 1, subset, ans);
        subset.remove(subset.size() - 1);
        
        //not pick
        //skipping picking the same number again 
        while(i < nums.length - 1 && (nums[i] == nums[i + 1] ) )
        {
            i++ ;
        }
        helper(nums, i + 1, subset, ans);
        return ;
    }
}
