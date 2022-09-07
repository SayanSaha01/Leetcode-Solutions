class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            HashSet<Integer> row = new HashSet<Integer>();
            for(int j=0;j<matrix[i].length;j++)
            {
                row.add(matrix[i][j]);
            }
            if(row.size()!=matrix.length)
            {
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            HashSet<Integer> col = new HashSet<Integer>();
            for(int j=0;j<matrix[i].length;j++)
            {
                col.add(matrix[j][i]);
            }
            if(col.size()!=matrix.length)
            {
                return false;
            }
        }
        return true;
    }
}