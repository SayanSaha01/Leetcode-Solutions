class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> min_set = new HashSet<>();
        Set<Integer> max_set = new HashSet<>();
        
        for(int i=0;i<matrix.length;i++)
        {
            int min=matrix[i][0];
            for(int j=0;j<matrix[0].length;j++)
            {
                min=Math.min(min,matrix[i][j]);
            }
            min_set.add(min);
        }
        
        for(int j=0;j<matrix[0].length;j++)
        {
            int max=matrix[0][j];
            for(int i=0;i<matrix.length;i++)
            {
                max=Math.max(max,matrix[i][j]);
            }
            max_set.add(max);
        }
        min_set.retainAll(max_set);
        List<Integer> list = new ArrayList<>(min_set);
        return list;
    }
}