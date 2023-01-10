class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max,maxarea(grid,i,j));
                }
            }
        }
        return max;
    }
    public int maxarea(int[][] grid,int i,int j)
    {
        if(i>=0 && j>=0 && j<grid[0].length && i<grid.length && grid[i][j]==1)
        {
            grid[i][j]=0;
            return 1+maxarea(grid,i-1,j)+maxarea(grid,i+1,j)+maxarea(grid,i,j-1)+maxarea(grid,i,j+1);
        }
        return 0;
    }
}