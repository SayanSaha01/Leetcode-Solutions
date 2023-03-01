class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        //since we can start from any element in the first row
        for(int j=0;j<m;j++)
        {
            min = Math.min(min,recursion(0,j,n-1,m-1,matrix,dp));
        }
        return min;
    }
    public int recursion(int i,int j,int n,int m,int[][] matrix,int[][] dp)
    {
        if(i<0 || j<0 || i>m || j>n) 
            return Integer.MAX_VALUE;
        if(i == n) 
            return matrix[i][j];
        if(dp[i][j]!=-1)
            return dp[i][j];
       return dp[i][j] = matrix[i][j] + Math.min(recursion(i+1,j-1,m,n,matrix,dp),
           Math.min(recursion(i+1,j,m,n,matrix,dp),recursion(i+1,j+1,m,n,matrix,dp)));
    }
}