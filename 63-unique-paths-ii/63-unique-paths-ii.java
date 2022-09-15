/*
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return recursion(m-1,n-1,obstacleGrid);
    }
    public int recursion(int i,int j,int[][] grid)
    {
        if(i<0 || j<0)
            return 0;
        if(grid[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        return recursion(i-1,j,grid) + recursion(i,j-1,grid);
    }
}
*/
/*
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(m-1,n-1,obstacleGrid,dp);
    }
    public int recursion(int i,int j,int[][] grid,int[][] dp)
    {
        if(i<0 || j<0)
            return 0;
        if(grid[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        dp[i][j] = recursion(i-1,j,grid,dp) + recursion(i,j-1,grid,dp);
        return dp[i][j];
    }
}
*/
//TABULATION
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(obstacleGrid[i][j]==1)
                    dp[i][j]=0;
                else if(i==0 && j==0)
                    dp[i][j]=1;
                else
                {
                    int up = 0;
                    int left = 0;
                    if(i>0)
                        up=dp[i-1][j];
                    if(j>0)
                        left = dp[i][j-1];
                    dp[i][j]=left+up;
                }
            }
        }
        return dp[m-1][n-1];
    }
}