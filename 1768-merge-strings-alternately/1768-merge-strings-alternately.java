class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int w1pointer = 0;
        int w2pointer = 0;
        for(int i=0;i<word1.length()+word2.length();i++)
        {
            if(w1pointer<word1.length())
            {
                sb.append(word1.charAt(w1pointer));
                w1pointer++;
            }
            if(w2pointer<word2.length())
            {
                sb.append(word2.charAt(w2pointer));
                w2pointer++;
            }
        }
        return sb.toString();
    }
}