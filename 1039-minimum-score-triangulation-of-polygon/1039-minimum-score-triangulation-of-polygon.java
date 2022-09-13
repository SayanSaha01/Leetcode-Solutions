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
//how do we figure out whether it is a 2D matrix or 1D matrix, check the number of variables changing 
//RECURSION => TABULATION
/*
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
*/
//TABULATION - it is the exact opposite of Top Down approach(MEMOIZATION)
class Solution {
    public int minScoreTriangulation(int[] values) {
        return tabulation(values);
    }
    public int tabulation(int[] v)
    {   
        int n=v.length;
        int[][] dp = new int[n][n];
        //In Top-Down dp we were starting i,j with 0 and n-1 but in Bottom up we are doing a bit different we start i from n-1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i+2;j<n;j++)   
//if we start j=i it will be a single pointer and wont form a triangle
//if we start from j=i+1 it will meet the base condition in memoization and recursion and return 0 so we start from i+2 and iterate till n 
            {
                int min = Integer.MAX_VALUE;
                for(int k=i+1;k<j;k++)        //we iterate from >i to <j
                {
                    min = Math.min(min,(v[i]*v[j]*v[k]+dp[i][k]+dp[k][j]));
                }
                dp[i][j]=min; 
            }      
        }
        return dp[0][n-1];          //as it bottom up, it is the reverse of top down
    }
}