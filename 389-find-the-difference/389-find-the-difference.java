class Solution {
    public char findTheDifference(String s, String t) {
        HashSet<Character> h = new HashSet<>();
        for(char c:(s+t).toCharArray())
        {
            if(!h.add(c))
            {
                h.remove(c);
            }
            else
            {
                h.add(c);
            }
        }
        Iterator<Character> i = h.iterator();
        return i.next();
    }
}