class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String word:word1)
        {
            sb1.append(word);
        }
        for(String words:word2)
        {
            sb2.append(words);
        }
        return sb1.toString().equals(sb2.toString());
    }
}