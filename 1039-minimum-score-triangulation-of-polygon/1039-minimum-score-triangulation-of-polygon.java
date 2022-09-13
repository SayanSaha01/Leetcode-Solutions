//RECURSIVE SOLUTION
/*
class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        return recursion(values,0,n-1);
    }
    public int recursion(int[] v,int i,int j)
    {
        if(i+1==j)          //if only two vertices are present
            return 0;
        int min = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++)        //we iterate from >i to <j
        {
            min = Math.min(min,v[i]*v[j]*v[k]+recursion(v,i,k)+recursion(v,k,j));
        }
        return min;
    }
}
*/
class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return memoization(values,0,n-1,dp);
    }
    public int memoization(int[] v,int i,int j,int[][] dp)
    {
        if(i+1==j)                    //if only two vertices are present
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++)        //we iterate from >i to <j
        {
            min = Math.min(min,v[i]*v[j]*v[k]+memoization(v,i,k,dp)+memoization(v,k,j,dp));
        }
        dp[i][j]=min;
        return dp[i][j];
    }
}