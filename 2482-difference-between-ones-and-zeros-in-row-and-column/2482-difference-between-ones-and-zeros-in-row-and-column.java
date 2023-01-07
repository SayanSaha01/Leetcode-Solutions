class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] mat = new int[row][col];
        int[] onerow = new int[row];
        int[] onescol = new int[col];
        //finding the 1's in each row
        for(int i=0;i<row;i++)
        {
            int c=0;
            for(int j=0;j<col;j++)
            {
                if(grid[i][j]==1)
                    c++;
            }
            onerow[i]=c;
        }
        //finding the 1's in each col
        for(int i=0;i<col;i++)
        {
            int count=0;
            for(int j=0;j<row;j++)
            {
                if(grid[j][i]==1)
                    count++;
            }
            onescol[i]=count;
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat[i][j]=onerow[i]+(onescol[j])-(row-onerow[i])-(col-onescol[j]);
            }
        }
        return mat;
    }
}