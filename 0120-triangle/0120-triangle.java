/*
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        return recursion(0,0,m-1,triangle);
    }
    public int recursion(int i,int j,int m,List<List<Integer>> triangle)
    {
        if(i==m)
        {
            return triangle.get(i).get(j);
        }
        else
        {
            int down = recursion(i+1,j,m,triangle) + triangle.get(i).get(j);
            int dright = recursion(i+1,j+1,m,triangle) + triangle.get(i).get(j);
            return Math.min(down,dright);
        }
        
    }
}
*/
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for(int[] d:dp)
            Arrays.fill(d,-1);
        return recursion(0,0,m-1,triangle,dp);
    }
    public int recursion(int i,int j,int m,List<List<Integer>> triangle,int[][] dp)
    {
        if(i==m)
        {
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        else
        {
            int down = recursion(i+1,j,m,triangle,dp) + triangle.get(i).get(j);
            int dright = recursion(i+1,j+1,m,triangle,dp) + triangle.get(i).get(j);
            return dp[i][j] = Math.min(down,dright);
        }
        
    }
}