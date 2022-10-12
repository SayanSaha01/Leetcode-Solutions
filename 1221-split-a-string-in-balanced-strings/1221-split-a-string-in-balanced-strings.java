class Solution {
    public int balancedStringSplit(String s) {
    int l=0,count=0;
    for(char c:s.toCharArray())
    {
        if(c=='L')
            l++;
        if(c=='R')
            l--;
        if(l==0)
            count++;
    }
    return count;
    }
}