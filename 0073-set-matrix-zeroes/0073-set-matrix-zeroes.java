class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowset = new HashSet<Integer>();
        Set<Integer> colset = new HashSet<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(rowset.contains(i) || colset.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}