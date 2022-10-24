class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<Character>();
        for(char c:allowed.toCharArray())
        {
            set.add(c);
        }
        int count=0;
        for(String str:words)
        {
            for(int i=0;i<str.length();i++)
            {
                if(!set.contains(str.charAt(i)))
                    break;
                if(i==str.length()-1)
                    count++;
            }
        }
        return count;
    }
}