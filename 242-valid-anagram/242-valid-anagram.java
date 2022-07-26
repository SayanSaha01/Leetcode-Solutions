class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] sarray = s.toCharArray();
        char[] tarray = t.toCharArray();
        Arrays.sort(sarray);
        Arrays.sort(tarray);
        String s1 = new String(sarray);
        String t1 = new String(tarray);
        return s1.equals(t1);
    }
}