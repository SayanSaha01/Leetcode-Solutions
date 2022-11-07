class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        int n = groupSizes.length;
        List<Integer> arr[] = new ArrayList[n+1];
        for(int i = 1; i <= n; i++)
            arr[i] = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int x = groupSizes[i];
            arr[x].add(i);
            if(arr[x].size() == x){
                res.add(arr[x]);
                arr[x] = new ArrayList<>();
            }   
        }
        return res;
    }
}