class Solution {
    int ans=0;
    public int getMaximumGold(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)
                {
                    dfs(i,j,grid,visited,0);
                }
            }
        }
        return ans;
        
    }
    public void dfs(int i,int j,int[][] grid,boolean[][] visited,int sum)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
            return;
        
        if(grid[i][j]==0 || visited[i][j]==true)
            return;
        
        visited[i][j]=true;
        sum+=grid[i][j];
        ans = Math.max(ans,sum);
        
        dfs(i+1,j,grid,visited,sum);
        dfs(i-1,j,grid,visited,sum);
        dfs(i,j+1,grid,visited,sum);
        dfs(i,j-1,grid,visited,sum);
        visited[i][j]=false;
    }
}