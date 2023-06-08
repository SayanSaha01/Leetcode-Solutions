class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> inner = new ArrayList<>();
        uniquesubset(set,inner,nums,0);
        
        List<List<Integer>> convertedList = new ArrayList<>();
        for (List<Integer> l : set) {
            convertedList.add(l);
        }
        
        return convertedList;
    }
    public void uniquesubset(Set<List<Integer>> set,List<Integer> inner,int[] nums,int idx)
    {
        if(idx>=nums.length)
        {
            set.add(new ArrayList<>(inner));
            return;
        }
        
        //pick
        inner.add(nums[idx]);
        uniquesubset(set,inner,nums,idx+1);
        
        //not pick
        inner.remove(inner.size()-1);
        uniquesubset(set,inner,nums,idx+1);

    }
}