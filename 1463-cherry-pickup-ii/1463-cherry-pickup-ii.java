/*
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;      // no of rows
        int n = grid[0].length;   // no of columns
//we need to pass n-1 as n denotes the number of columns in first row and n-1 is the last row of the first cell whereas if we pass m-1 it will pass the last row
        return recursion(0,0,n-1,m,n,grid);
    }
    public int recursion(int i,int j1,int j2,int row,int col,int[][] grid)
    {
        if(j1<0 || j1>=col || j2<0 || j2>=col)
            return Integer.MIN_VALUE;
        
        if(i==row-1)             //last row
        {
            if(j1==j2)
                return grid[i][j1];
            else
                return grid[i][j1]+grid[i][j2];
        }
        int max=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                int val=0;
                if(j1==j2)
                    val = grid[i][j1];
                else
                    val = grid[i][j1]+grid[i][j2];
                val+=recursion(i+1,dj1+j1,dj2+j2,row,col,grid);
                max = Math.max(max,val);
            }
        }
        return max;
    }
}
*/
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;      // no of rows
        int n = grid[0].length;   // no of columns
//we need to pass n-1 as n denotes the number of columns in first row and n-1 is the last row of the first cell whereas if we pass m-1 it will pass the last row
        int[][][] dp = new int[m][n][n];
        for(int[][] row:dp)
            for(int[] col:row)
                Arrays.fill(col,-1);
        return recursion(0,0,n-1,m,n,grid,dp);
    }
    public int recursion(int i,int j1,int j2,int row,int col,int[][] grid,int[][][] dp)
    {
        if(j1<0 || j1>=col || j2<0 || j2>=col)
            return Integer.MIN_VALUE;
        
        if(i==row-1)             //last row
        {
            if(j1==j2)
                return grid[i][j1];
            else
                return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1)
            return dp[i][j1][j2];
        int max=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++)
        {
            for(int dj2=-1;dj2<=1;dj2++)
            {
                int val=0;
                if(j1==j2)
                    val = grid[i][j1];
                else
                    val = grid[i][j1]+grid[i][j2];
                val+=recursion(i+1,dj1+j1,dj2+j2,row,col,grid,dp);
                max = Math.max(max,val);
            }
        }
        return dp[i][j1][j2]=max;
    }
}