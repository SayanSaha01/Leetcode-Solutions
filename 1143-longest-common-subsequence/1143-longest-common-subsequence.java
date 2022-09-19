/*
class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        return recursion(text1,text2,0,0);
    }
    public int recursion(String text1,String text2,int i,int j)
    {
        if(i==text1.length())
            return 0;
        if(j==text2.length())
            return 0;
        int ans = 0;
        if(text1.charAt(i)==text2.charAt(j))
        {
            ans = 1 + recursion(text1,text2,i+1,j+1);
        }
        else
        {
            ans = Math.max(recursion(text1,text2,i+1,j),recursion(text1,text2,i,j+1));
        }
        return ans;
    }
}
*/
class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return recursion(text1,text2,n-1,m-1,dp);
    }
    public int recursion(String text1,String text2,int i,int j,int[][] dp)
    {
        if(i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans = 0;
        if(text1.charAt(i)==text2.charAt(j))
        {
            ans = 1 + recursion(text1,text2,i-1,j-1,dp);
        }
        else
        {
            ans = Math.max(recursion(text1,text2,i-1,j,dp),recursion(text1,text2,i,j-1,dp));
        }
        return dp[i][j]=ans;
    }
}