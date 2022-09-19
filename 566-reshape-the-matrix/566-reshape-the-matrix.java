class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][] reshape = new int[r][c];
        
        if(mat.length*mat[0].length!=r*c)  
            return mat;
//adding elements from the matrix into the new array hence traversing over the old matrix row and col
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                reshape[row][col] = mat[i][j];
                col++;
                if(col==c)
                {
                    row++;
                    col=0;
                }
            }
        }
        return reshape;
    }
}