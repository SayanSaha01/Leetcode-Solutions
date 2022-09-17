//why using Integer.MAX_VALUE throws error, as it itself occupies the highest value so when are trying to return the max in return it will always return Integer.MAX_VALUE and if we use Integer.MIN_VALUE then also it will throw error as we add the val to Integer.MIN_VALUE thereby it disrupts the result
/*
class Solution {
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;            //we need to pass c-1 as c denotes the number of columns in first row and c-1 is the last row of the first cell whereas if we pass r-1 it will pass the no of rows
        return f(0,0,c-1,r,c,grid);
    }
    public int f(int i1,int j1,int j2,int r,int c,int[][] grid){
        if(j1<0 || j1>=c || j2<0 || j2>=c)
            return Integer.MIN_VALUE;
        if(i1==r-1){
            if(j1==j2)
                return grid[i1][j1];
            else
                return grid[i1][j1]+grid[i1][j2];
        }
        int max= Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2)
                    value=grid[i1][j1];
                else
                    value=grid[i1][j1]+grid[i1][j2];
                value+=f(i1+1,j1+dj1,j2+dj2,r,c,grid);
                max=Math.max(max,value);
            }
        }
        return max;
    }
}
*/

class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int [m][n][n];
        for(int row[][]:dp){
            for(int col[]:row)
                Arrays.fill(col,-1);
        }
        return f(0,0,n-1,m,n,grid,dp);
    }
    public static int f(int i,int j1,int j2,int m,int n,int[][] grid,int[][][] dp){
        if(j1<0 || j1>=n || j2<0 || j2>=n)
            return Integer.MIN_VALUE;
        if(i==m-1){
            if(j1==j2)
                return grid[i][j1];
            else
                return grid[i][j1]+grid[i][j2];
        }
        if(dp[i][j1][j2]!=-1)
            return dp[i][j1][j2];
        int max=Integer.MIN_VALUE;
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2)
                    value=grid[i][j1];
                else
                    value=grid[i][j1]+grid[i][j2];
                value+=f(i+1,j1+dj1,j2+dj2,m,n,grid,dp);
                max=Math.max(max,value);
            }
        }
        return dp[i][j1][j2]=max;
    }
}