class Solution {
    public int strStr(String haystack, String needle) {
        int x=-1;
        for(int i=0;i<haystack.length();i++)
        {
            x=haystack.indexOf(needle);
        }
        return x;
    }
}