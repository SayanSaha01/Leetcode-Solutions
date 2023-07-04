/*class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        return recursion(m-1,n-1,obstacleGrid);
    }
    public int recursion(int i,int j,int[][] obstacleGrid)
    {
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0 || obstacleGrid[i][j]==1)
            return 0;
        int up = recursion(i-1,j,obstacleGrid);
        int left = recursion(i,j-1,obstacleGrid);
        return up+left;
    }
}*/
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] d:dp)
            Arrays.fill(d,-1);
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