class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for(int i=0;i<k;i++)
        {
            sb.append(words[i]);
            if(i<k-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}