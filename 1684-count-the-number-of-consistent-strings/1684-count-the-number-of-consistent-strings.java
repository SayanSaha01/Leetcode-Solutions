class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String word:words)
        {
            count+=compare(allowed,word);
        }
        return count;
    }
    public int compare(String superset,String subset)
    {
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();
        for(char c:superset.toCharArray())
            set1.add(c);
        for(char c:subset.toCharArray())
            set2.add(c);
        return set1.containsAll(set2)?1:0;
    }
}