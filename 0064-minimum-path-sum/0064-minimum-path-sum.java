/*
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return recursion(m-1,n-1,grid);
    }
    public int recursion(int row,int col,int[][] grid)
    {
        if(row==0 && col==0)
            return grid[0][0];
        if(row==0)
            return grid[row][col]+recursion(row,col-1,grid);
        if(col==0)
            return grid[row][col]+recursion(row-1,col,grid);
        return grid[row][col]+Math.min(recursion(row-1,col,grid),recursion(row,col-1,grid));
    }
}*/
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return recursion(m-1,n-1,grid,dp);
    }
    public int recursion(int row,int col,int[][] grid,int[][] dp)
    {
        if(row==0 && col==0)
            return grid[0][0];
        if(dp[row][col]!=-1)
            return dp[row][col];
        if(row==0)
            return grid[row][col]+recursion(row,col-1,grid,dp);
        if(col==0)
            return grid[row][col]+recursion(row-1,col,grid,dp);
        return dp[row][col] = grid[row][col]+Math.min(recursion(row-1,col,grid,dp),recursion(row,col-1,grid,dp));
    }
}