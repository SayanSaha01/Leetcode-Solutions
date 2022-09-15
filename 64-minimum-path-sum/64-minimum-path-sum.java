/*
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return recursion(m-1,n-1,grid);
    }
    public int recursion(int i,int j,int[][] grid)
    {
        if(i==0 && j==0)
            return grid[0][0];
        if(i<0 || j<0)
            return Integer.MAX_VALUE;
        
        int up = 0;
        int left = 0;
        left = recursion(i,j-1,grid);
        up = recursion(i-1,j,grid);
        return grid[i][j] + Math.min(left,up);
    }
}
*/
//RECURSION => MEMOIZATION
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(m-1,n-1,grid,dp);
    }
    public int recursion(int i,int j,int[][] grid,int[][] dp)
    {
        if(i==0 && j==0)
            return grid[0][0];
        if(i<0 || j<0)
            return Integer.MAX_VALUE;
        
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up = 0;
        int left = 0;
        left = recursion(i,j-1,grid,dp);
        up = recursion(i-1,j,grid,dp);
        dp[i][j]= grid[i][j] + Math.min(left,up);
        return dp[i][j];
    }
}
