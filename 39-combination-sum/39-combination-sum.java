class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        combination(list,new ArrayList<>(),candidates,target,0);
        return list;
    }
    public void combination(List<List<Integer>> list,List<Integer> ds,int[] arr,int target,int idx)
    {
        if(target<0)
            return;
        else if(target==0)
            list.add(new ArrayList<>(ds));
        else
        {
            for(int i=idx;i<arr.length;i++)
            {
                ds.add(arr[i]);
                combination(list,ds,arr,target-arr[i],i);
                ds.remove(ds.size()-1);
            }
        }
    }
}