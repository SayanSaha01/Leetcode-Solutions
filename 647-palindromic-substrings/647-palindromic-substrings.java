class Solution {
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for(int g=0;g<s.length();g++)
        {
//here g indicates diagonal with gap 1,2,3,4 are all starting from the 0th row and 1st,2nd,3rd,4th cols respectively, think of them as substrings of length g
            for(int i=0,j=i+g;j<s.length();i++,j++)
/*all the diagonals start from the ith row ,specifically from the jth column, and end at the s.length() indexed row,
for example if we taking diagonals with gap 1 (substring 1)we will start from the 0th row  and 1st col and end at s.length() indexed row
i++,j++ to indicate that we are moving diagonally*/
            {
                if(g==0) 
//g==0 indicates substrings with gap 0 and length 1, example a, which are always palindromic hence mark them 1
                    dp[i][j]=true;
                else if(g==1)
//g=0 denotes substrings with gap 1 and length 2 for ex ab,ac,aa, we need to check if first and last character are equal or not
                    dp[i][j]=s.charAt(i)==s.charAt(j);
                else{
//for substrings with longer lengths we check for the first and last characters and then check for the middle part if it is a palindrome or not, for that we go diagonally downward to check if that part is true or not
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