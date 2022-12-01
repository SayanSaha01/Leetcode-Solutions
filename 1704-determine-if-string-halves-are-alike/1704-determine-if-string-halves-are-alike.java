class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');
        int count1=0;
        int count2=0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(vowel.contains(s.charAt(i)))
            {
                count1++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(vowel.contains(s.charAt(i)))
            {
                count2++;
            }
        }
        return count1==count2;
    }
}