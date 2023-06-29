/*
class Solution {
    public int uniquePaths(int m, int n) {
        return count(m-1,n-1);
    }
    public int count(int i,int j)
    {
        if(i<0 || j<0)
            return 0;
        if(i==0 && j==0)
            return 1;
        int up = count(i-1,j);
        int left = count(i,j-1);
        return up+left;
    }
}
*/
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return count(m-1,n-1,dp);
    }
    public int count(int i,int j,int[][] dp)
    {
        if(i<0 || j<0)
            return 0;
        if(i==0 && j==0)
            return 1;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up = count(i-1,j,dp);
        int left = count(i,j-1,dp);
        dp[i][j]=up+left;
        return dp[i][j];
    }
}