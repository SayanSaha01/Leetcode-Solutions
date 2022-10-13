class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        HashSet<Character> set = new HashSet<Character>();
        int start=0,end=0;
        while(end<s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                end++;
                max=Math.max(max,set.size());
            }
            else       //if the set encounters an already existing character
            {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}