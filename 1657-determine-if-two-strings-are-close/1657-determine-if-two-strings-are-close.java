class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freqmap1 = new int[26];
        int[] freqmap2 = new int[26];
        
        if(word1.length()!=word2.length())
            return false;
        for(char c:word1.toCharArray())
        {
            freqmap1[c-'a']++;
        }
        for(char c:word2.toCharArray())
        {
            freqmap2[c-'a']++;
        }
        
        //checking if some characters are in word1 and not in word2 and vice-versa
        for(int i=0;i<26;i++)
        {
            if((freqmap1[i]==0 && freqmap2[i]!=0) || (freqmap1[i]!=0 && freqmap2[i]==0))
                return false;
        }
        Arrays.sort(freqmap1);
        Arrays.sort(freqmap2);
        
        // we are sorting the frequencies to find whether one or the other character in the two strings have the same character count or not
        for(int i=0;i<26;i++)
        {
            if(freqmap1[i]!=freqmap2[i])
                return false;
        }
        return true;
    }
}