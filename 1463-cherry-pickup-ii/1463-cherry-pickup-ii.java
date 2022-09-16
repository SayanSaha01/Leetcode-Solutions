/*//why using Integer.MAX_VALUE throws error, as it itself occupies the highest value so when are trying to return the max in return it will always return Integer.MAX_VALUE and if we use Integer.MIN_VALUE then also it will throw error as we add the val to Integer.MIN_VALUE thereby it disrupts the result

class Solution {
    public int cherryPickup(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        return f(0,0,c-1,r,c,grid);
    }
    public int f(int i1,int j1,int j2,int r,int c,int[][] grid){
        if(j1<0 || j1>=c || j2<0 || j2>=c)
            return (-1)*Integer.MAX_VALUE;
        if(i1==r-1){
            if(j1==j2)
                return grid[i1][j1];
            else
                return grid[i1][j1]+grid[i1][j2];
        }
        int max= (-1)*Integer.MAX_VALUE;
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
        int r=grid.length;
        int c=grid[0].length;
        int dp[][][]=new int [r][c][c];
        for(int row[][]:dp){
            for(int col[]:row)
                Arrays.fill(col,-1);
        }
        return f(0,0,c-1,r,c,grid,dp);
    }
    public static int f(int i1,int j1,int j2,int r,int c,int[][] grid,int[][][] dp){
        if(j1<0 || j1>=c || j2<0 || j2>=c)
            return (-1)*(int)Math.pow(10,8);
        if(i1==r-1){
            if(j1==j2)
                return grid[i1][j1];
            else
                return grid[i1][j1]+grid[i1][j2];
        }
        if(dp[i1][j1][j2]!=-1)
            return dp[i1][j1][j2];
        int max=-1*(int)Math.pow(10,8);
        for(int dj1=-1;dj1<=1;dj1++){
            for(int dj2=-1;dj2<=1;dj2++){
                int value=0;
                if(j1==j2)
                    value=grid[i1][j1];
                else
                    value=grid[i1][j1]+grid[i1][j2];
                value+=f(i1+1,j1+dj1,j2+dj2,r,c,grid,dp);
                max=Math.max(max,value);
            }
        }
        return dp[i1][j1][j2]=max;
    }
}