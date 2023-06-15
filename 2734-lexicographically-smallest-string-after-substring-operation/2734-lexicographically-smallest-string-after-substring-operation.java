class Solution {
    public String smallestString(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        if(ch[0] == 'a') {     
            while(i < ch.length && ch[i] == 'a') i++;
            if(i == ch.length) {
                ch[i-1] = 'z';
                return String.valueOf(ch);
            }
        }
        
        if(ch[i] != 'a') {
            while(i < ch.length && ch[i] != 'a') {
                ch[i] = (char)(ch[i] - 1);
                i++;
            }
        }
        return String.valueOf(ch);
    }
}