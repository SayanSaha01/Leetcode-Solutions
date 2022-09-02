class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for(char x:s.toCharArray())
        {
            if(set.contains(x))
            {
                return x;
            }
            else
            {
                set.add(x);
            }
        }
        return ' ';
    }
}