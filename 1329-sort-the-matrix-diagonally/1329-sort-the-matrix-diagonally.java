class Solution {
    public int[][] diagonalSort(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<Integer,PriorityQueue<Integer>>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!map.containsKey(i-j))
                {
                    map.put(i-j,new PriorityQueue<Integer>());
                }
                map.get(i-j).add(matrix[i][j]);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j] = map.get(i-j).poll();
            }
        }
        return matrix;
    }
}