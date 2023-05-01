class Solution {
    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public int findMaxFish(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                max=Math.max(max,dfs(grid,i,j));
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j)
    {
        if(i<0 || j<0 || j>=grid[0].length || i>=grid.length || grid[i][j]==0)
            return 0;
        
        int res= grid[i][j];
        grid[i][j]=0;
        for(int[] d:dir)
        {
            res+=dfs(grid,i+d[0],j+d[1]);
        }
        return res;
    }
}