class Solution {
    
    Set<List<Integer>> list = new HashSet<>();
    int[] visited = null;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        visited = new int[nums.length];
        backtrack(nums,new ArrayList<>());
        return new ArrayList<>(list);
    }
    
    public void backtrack(int[] nums, List<Integer> tl)
    {
        if(tl.size()==nums.length)
        {
            list.add(new ArrayList<>(tl));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==0)
            {
                tl.add(nums[i]);
                visited[i]=1;
                backtrack(nums,tl);
                visited[i]=0;
                tl.remove(tl.size()-1);
            }
        }
    }
}