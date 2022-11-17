class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0 || grid==null)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    int area = dfs(grid,i,j,0);
                    max = Math.max(area,max);
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j,int max)
    {
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length ||grid[i][j]==0)
            return 0;
        grid[i][j] = 0;
        return 1 + dfs(grid,i-1,j,max) + dfs(grid,i+1,j,max) + dfs(grid,i,j-1,max) + dfs(grid,i,j+1,max);
            
    }
}