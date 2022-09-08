class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(list,new ArrayList<>(),candidates,target,0);
        return list;
    }
    public void combination(List<List<Integer>> list, List<Integer> ds,int[] arr,int target,int idx)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            ds.add(arr[i]);
            combination(list,ds,arr,target-arr[i],i+1);
            ds.remove(ds.size()-1);
        }
    }
}