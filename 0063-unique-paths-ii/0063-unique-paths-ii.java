/*
class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return recursion(m-1,n-1,grid);
    }
    public int recursion(int i,int j,int[][] grid)
    {
        if(i<0 || j<0 || grid[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        int up = recursion(i-1,j,grid);
        int left = recursion(i,j-1,grid);
        return up+left;
    }
}
*/
class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp =  new int[m][n];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return recursion(m-1,n-1,dp,grid);
    }
    public int recursion(int i,int j,int[][] dp,int[][] grid)
    {
        if(i<0 || j<0 || grid[i][j]==1)
            return 0;
        if(i==0 && j==0)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up = recursion(i-1,j,dp,grid);
        int left = recursion(i,j-1,dp,grid);
        return dp[i][j]=up+left;
    }
}