class Solution {
    public int maxVowels(String s, int k) {
        int len = s.length();
        int max = 0;
        int vowels = 0;
       
        for(int i = 0;i<len;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)) vowels++;
            if(i >= k)
            {
                char oldch = s.charAt(i - k);
                if(isVowel(oldch)) vowels--; 
            }
            max = Math.max(max,vowels); 
        }
        return max;
    }
    boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;     
    }
}