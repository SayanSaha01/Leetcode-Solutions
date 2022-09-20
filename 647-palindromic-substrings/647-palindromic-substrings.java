class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for(int g=0;g<s.length();g++)
        {
//diagonal with gap 1,2,3,4 are all starting from the 0th row and 1st,2nd,3rd,4th cols respectively
            for(int i=0,j=g;j<s.length();i++,j++)
            {
                if(g==0)
                    dp[i][j]=true;
                else if(g==1)
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }else{
                        dp[i][j]=false;
                    }
                }
                if(dp[i][j])
                    count++;
            }
        }
        return count;
    }
}