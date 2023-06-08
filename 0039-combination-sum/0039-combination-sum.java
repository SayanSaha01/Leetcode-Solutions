class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        combination(list,inner,candidates,target,0);
        return list;
    }
    public void combination(List<List<Integer>> list,List<Integer> inner,int[] candidates,int target,int idx)
    {
        if(idx==candidates.length)
        {
            if(target==0)
                list.add(new ArrayList<>(inner));
                return;
        }
        
        if(candidates[idx]<=target)
        {
            inner.add(candidates[idx]);
            combination(list,inner,candidates,target-candidates[idx],idx);;
            inner.remove(inner.size()-1);
        }
        combination(list,inner,candidates,target,idx+1);
    }
}