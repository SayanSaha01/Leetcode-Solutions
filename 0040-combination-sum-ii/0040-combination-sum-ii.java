class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arraylist = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        Arrays.sort(candidates);
        unique_combination(arraylist,inner,candidates,target,0);

        return arraylist;
    }
    public void unique_combination(List<List<Integer>> set,List<Integer> inner,int[] candidates,int target,int start)
    {
        if(target == 0) 
            set.add(new ArrayList<>(inner));
        for (int i = start; i < candidates.length; i++) 
        {
             if(i > start && candidates[i] == candidates[i-1]) 
                 continue; /** skip duplicates */
             if(candidates[i]>target)
                 break;
             inner.add(candidates[i]);
             unique_combination(set, inner, candidates, target - candidates[i], i+1);
             inner.remove(inner.size() - 1);
        }
    }
}