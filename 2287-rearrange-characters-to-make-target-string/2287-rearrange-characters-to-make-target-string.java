class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] sarr = new char[26];
        char[] tarr = new char[26];
        for(char c:s.toCharArray())
        {
            sarr[c-'a']++;
        }
        for(char c:target.toCharArray())
        {
            tarr[c-'a']++;
        }
        int min=Integer.MAX_VALUE;
        for(char c:target.toCharArray())
        {
            min = Math.min(sarr[c-'a']/tarr[c-'a'],min);
        }
        return min;
    }
}