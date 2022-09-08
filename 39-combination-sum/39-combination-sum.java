class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>(); 
        combination(list,new ArrayList<>(),candidates,target,0);
        return list;
    }
    public void combination(List<List<Integer>> list, List<Integer> ds,int[] arr,int target,int idx)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[idx]<=target)
        {
            ds.add(arr[idx]);
            combination(list,ds,arr,target-arr[idx],idx);
            ds.remove(ds.size()-1);
        }
        combination(list,ds,arr,target,idx+1);
    }
}