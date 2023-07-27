/*
class Solution {
    public int uniquePaths(int m, int n) {
        return paths(m-1,n-1);
    }
    public int paths(int i,int j)
    {
        if(i<0 || j<0)
            return 0;
        if(i==0 && j==0)
            return 1;
        int up = paths(i-1,j);
        int left = paths(i,j-1);
        return up+left;
    }
}
*/
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return recursion(m-1,n-1,dp);
    }
    public int recursion(int i,int j,int[][] dp)
    {
        if(i<0 || j<0)
            return 0;
        if(i==0 && j==0)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up = recursion(i-1,j,dp);
        int left = recursion(i,j-1,dp);
        return dp[i][j]=up+left;
    }
}