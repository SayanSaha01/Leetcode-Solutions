class Solution {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        return !str.contains("00") && !str.contains("11");
    }
}