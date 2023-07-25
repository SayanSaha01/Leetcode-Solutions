class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = s.lastIndexOf(" ")+1;
        return s.length()-length;
    }
}