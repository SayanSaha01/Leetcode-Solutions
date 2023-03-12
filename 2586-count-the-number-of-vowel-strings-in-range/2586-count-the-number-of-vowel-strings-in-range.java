class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            if(vowel(words[i],0,words[i].length()-1))
                count++;
        }
        return count;
    }
    public boolean vowel(String st,int s,int e)
    {
        char a = st.charAt(s);
        char b = st.charAt(e);
        if((a=='a' || a=='e' || a=='i' || a=='o' || a=='u') && 
            (b=='a' || b=='e' || b=='i' || b=='o' || b=='u'))
            return true;
        return false;
        
    }
}