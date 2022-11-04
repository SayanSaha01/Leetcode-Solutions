class Solution {
    public String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int start=0;
        int end = s.length()-1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('O');
        set.add('I');
        set.add('U');
        while(start<end)
        {
            if((set.contains(ch[start])) && (set.contains(ch[end])))
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            else if((set.contains(ch[start])) && (!set.contains(ch[end])))
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return new String(ch);
    }
}