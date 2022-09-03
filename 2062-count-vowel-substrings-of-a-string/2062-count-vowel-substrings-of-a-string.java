class Solution {
    public int countVowelSubstrings(String word) {
        HashSet<Character> set = new HashSet<Character>();
        int n = word.length();
        int vow = 0;
        for(int i = 0; i < n-4; i++)    // as the substring of vowels is of length 5
        {
            set.clear();
            for(int j = i; j < n; j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    set.add(ch);
                    if(set.size() == 5)
                        vow++;
                }
                else
                    break;
            }
        }
        return vow;      
    }
}