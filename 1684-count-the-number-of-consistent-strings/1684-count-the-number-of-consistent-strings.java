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
            int j=0;
            while(j<str.length() && set.contains(str.charAt(j)))
                j++;
            if(j==str.length())
                count++;
        }
        return count;
    }
}