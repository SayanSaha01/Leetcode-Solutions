//RECURSION
/*
class Solution {
    public int uniquePaths(int m, int n) {
        return recursion(m-1,n-1);
    }
    public int recursion(int i,int j)
    {
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        int up = recursion(i-1,j);
        int left = recursion(i,j-1);
        return left+up;
    }
}
*/
//RECURSION => MEMOIZATION
/*class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return memoization(m-1,n-1,dp);
    }
    public int memoization(int i,int j,int[][] dp)
    {
        if(i==0 && j==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int up = memoization(i-1,j,dp);
        int left = memoization(i,j-1,dp);
        dp[i][j]= left+up;
        return dp[i][j];
    }
}*/
//TABULATION
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
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