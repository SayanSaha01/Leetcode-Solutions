class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        String vowel="aeiouAEIOU";
        char[] ch = s.toCharArray();
        while(start<end)
        {
            if(!vowel.contains(ch[start]+""))
            {
                start++;
            }
            if(!vowel.contains(ch[end]+""))
            {
                end--;
            }
            if(vowel.contains(ch[start]+"") && vowel.contains(ch[end]+""))
            {
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}