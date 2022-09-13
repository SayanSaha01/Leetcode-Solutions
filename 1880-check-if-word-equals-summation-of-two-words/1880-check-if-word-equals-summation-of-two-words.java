class Solution {
    public boolean isSumEqual(String first, String second, String target) {
        int fsum=0,ssum=0,tsum=0;
        for(char ch:first.toCharArray())
        {
            fsum+=ch-'a';
            fsum*=10;
        }
        for(char ch:second.toCharArray())
        {
            ssum+=ch-'a';
            ssum*=10;
        }
        for(char ch:target.toCharArray())
        {
            tsum+=ch-'a';
            tsum*=10;
        }
        return fsum+ssum==tsum;
    }
}