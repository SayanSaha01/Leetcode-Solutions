/*
class Solution {
    public int numDistinct(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1<l2)
            return 0;
        return distinct(l1-1,l2-1,s,t);
    }
    public int distinct(int i,int j,String s,String t)
    {
        if(j<0)
            return 1;
        if(i<0)
            return 0;
        if(s.charAt(i)==t.charAt(j))
        {
            return distinct(i-1,j-1,s,t) + distinct(i-1,j,s,t);
        }
        else
            return distinct(i-1,j,s,t);
    }
}
*/
class Solution {
    public int numDistinct(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if(l1<l2)
            return 0;
        int[][] memo = new int[l1][l2];
        for(int[] m:memo)
            Arrays.fill(m,-1);
        return distinct(l1-1,l2-1,s,t,memo);
    }
    public int distinct(int i,int j,String s,String t,int[][] memo)
    {
        if(j<0)
            return 1;
        if(i<0)
            return 0;
        if(memo[i][j]!=-1)
            return memo[i][j];
        if(s.charAt(i)==t.charAt(j))
        {
            return memo[i][j] = distinct(i-1,j-1,s,t,memo)+distinct(i-1,j,s,t,memo);
        }
        else
            return memo[i][j] = distinct(i-1,j,s,t,memo);
    }
}