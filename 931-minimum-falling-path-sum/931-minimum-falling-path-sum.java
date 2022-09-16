//RECURSION
/*
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
            min=Math.min(min,f(m-1,j,matrix));
        }
        return min;
    }
    public static int f(int i,int j,int[][] matrix){
        if(i<0 || j<0 || j>=matrix[0].length) 
            return (int)Math.pow(10,9);
        if(i==0)
            return matrix[0][j];
        int down = matrix[i][j] + f(i-1,j,matrix);
        int ld = matrix[i][j] + f(i-1,j-1,matrix);
        int rd = matrix[i][j] + f(i-1,j+1,matrix);
        return Math.min(down,Math.min(ld,rd));
    }
}
*/
//RECURSION => MEMOIZATION

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int min=Integer.MAX_VALUE;
        int[][] dp = new int[m][m];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        for(int j=0;j<m;j++)
        {
        //iterating over the elements of the last row
            min=Math.min(min,f(m-1,j,matrix,dp));            
        }
        return min;
    }
    public static int f(int i,int j,int[][] matrix,int[][] dp){
        if(i<0 || j<0 || j>=matrix[0].length) 
            return (int)1e9;
        if(i==0)
            return matrix[0][j];
        if(dp[i][j]!=-1)
            return dp[i][j];
        int down = matrix[i][j] + f(i-1,j,matrix,dp);
        int ld = matrix[i][j] + f(i-1,j-1,matrix,dp);
        int rd = matrix[i][j] + f(i-1,j+1,matrix,dp);
        dp[i][j] = Math.min(down,Math.min(ld,rd));
        return dp[i][j];
    }
}
