class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        int[] alphabetcount = new int[26];
        for(char c:magazine.toCharArray())
        {
            alphabetcount[c-'a']++;
        }
        for(char c:ransomNote.toCharArray())
        {
            if(alphabetcount[c-'a']==0)
                return false;
            alphabetcount[c-'a']--;
        }
        return true;
    }
}