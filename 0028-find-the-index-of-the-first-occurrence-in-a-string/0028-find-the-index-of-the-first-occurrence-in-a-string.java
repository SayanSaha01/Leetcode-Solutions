class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.contains(needle)==true?haystack.indexOf(needle):-1;
    }
}