class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                count+=compare(words[i],words[j]);
            }
        }
        return count;
    }
    public int compare(String word1,String word2)
    {
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();
        for(char c:word1.toCharArray())
            set1.add(c);
        for(char c:word2.toCharArray())
            set2.add(c);
        return set1.equals(set2)?1:0;
    }
}