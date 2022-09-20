class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder r = new StringBuilder(s);
        r.reverse();
        return lps(s,r.toString());
    }
    public int lps(String s,String t)
    {
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int i=0;i<=s.length();i++)
            dp[i][0]=0;
        for(int j=0;j<=t.length();j++)
            dp[0][j]=0;
        for(int i=1;i<=s.length();i++)
        {
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s.length()][t.length()];
    }
}