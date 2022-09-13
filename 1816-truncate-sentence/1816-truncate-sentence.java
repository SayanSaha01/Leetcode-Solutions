/*class Solution {
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
}*/
class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
                if(count==k)
                s=s.substring(0,i);
            }
        }
        return s;
    }
}