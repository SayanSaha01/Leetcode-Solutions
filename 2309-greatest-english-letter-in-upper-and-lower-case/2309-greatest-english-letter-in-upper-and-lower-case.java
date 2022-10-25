class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for(char c:s.toCharArray())
        {
            set.add(c);
        }
        for(char c='Z';c>='A';c--)
        {
            if(set.contains(c) && set.contains(Character.toLowerCase(c)))
            {
                return ""+c;
            }
        }
        return "";
    }
}