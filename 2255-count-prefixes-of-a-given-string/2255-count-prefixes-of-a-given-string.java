class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        for(String str:words)
        {
            if(s.indexOf(str)==0)
                count++;
        }
        return count;
    }
}