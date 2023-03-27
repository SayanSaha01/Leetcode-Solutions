class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        int[] count = new int[1005];
        for(int[] arr:items1)
        {
            count[arr[0]]+=arr[1];
        }
        for(int[] arr:items2)
        {
            count[arr[0]]+=arr[1];
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
                continue;
            result.add(Arrays.asList(i,count[i]));
        }
        return result;
    }
}