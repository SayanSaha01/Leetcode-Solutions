class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> inner = new ArrayList<>();
        Arrays.sort(candidates);
        unique_combination(set,inner,candidates,target,0);
        
        List<List<Integer>> arraylist = new ArrayList<>();
        for(List<Integer> l :set)
        {
            arraylist.add(l);
        }
        return arraylist;
    }
    public void unique_combination(Set<List<Integer>> set,List<Integer> inner,int[] candidates,int target,int start)
    {
        if(target < 0) 
            return; /** no solution */
        else if(target == 0) 
            set.add(new ArrayList<>(inner));
        else
        {
          for (int i = start; i < candidates.length; i++) 
          {
             if(i > start && candidates[i] == candidates[i-1]) 
                 continue; /** skip duplicates */
             inner.add(candidates[i]);
             unique_combination(set, inner, candidates, target - candidates[i], i+1);
             inner.remove(inner.size() - 1);
          }
        }
    }
}