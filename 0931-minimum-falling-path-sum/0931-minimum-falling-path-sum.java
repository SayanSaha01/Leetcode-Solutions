class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        for(int[] temp:dp)
            Arrays.fill(temp,Integer.MAX_VALUE); //since the constraints say we can also have negative values

        int max=99999;
        for(int i=0;i<n;i++){
            int val = recur(0,i,matrix,dp,m,n);
            max = Math.min(max,val);
        }

        return max;    
    }


    public int recur(int r,int c,int[][]matrix,int[][] dp,int m, int n){
        if(r<0 || r>=m || c<0 || c>=n ) 
            return 99999; // return the largest value possible so as to not consider it
        
        if(r==m-1)
            return matrix[r][c];


        if(dp[r][c]!=Integer.MAX_VALUE)
            return dp[r][c];
        
        
        int down = matrix[r][c]+recur(r+1,c,matrix,dp,m,n);
        int downLeft = matrix[r][c]+recur(r+1,c-1,matrix,dp,m,n);
        int downRight = matrix[r][c]+recur(r+1,c+1,matrix,dp,m,n);

        dp[r][c] = Math.min(down,Math.min(downLeft,downRight));
        return dp[r][c];
    }



}