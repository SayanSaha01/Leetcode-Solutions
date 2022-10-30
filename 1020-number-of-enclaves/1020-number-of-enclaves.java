class Solution {
    public int numEnclaves(int[][] grid) {
        int result = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    dfs(grid,i,j);
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    result++;
                }
            }
        }
        return result;
    }
    public void dfs(int[][] grid,int i,int j)
    {
        if(i>=0 && i<=grid.length-1 && j>=0 && j<=grid[0].length-1 && grid[i][j]==1)
        {
            grid[i][j]=0;
            dfs(grid,i-1,j);
            dfs(grid,i,j+1);
            dfs(grid,i,j-1);
            dfs(grid,i+1,j);
        }
    }
}