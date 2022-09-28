class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c:letters)
        {
            if(c-'a'>target-'a')
                return c;
        }
        return letters[0];
    }
}