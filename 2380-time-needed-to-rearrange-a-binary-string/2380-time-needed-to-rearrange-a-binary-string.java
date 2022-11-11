class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int n = 0;
        while(s.indexOf("01") >= 0) {
            s = s.replace("01", "10");
            ++n;
        }
        return n;
    }
}