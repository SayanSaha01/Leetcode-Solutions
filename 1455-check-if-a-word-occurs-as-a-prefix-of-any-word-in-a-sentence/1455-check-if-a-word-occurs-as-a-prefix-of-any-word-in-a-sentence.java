class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index=1;
        String[] word = sentence.split(" ");
        for(String str:word)
        {
            if(str.indexOf(searchWord)==0)
            {
                return index;
            }
            else
            {
                index++;
            }
        }
        return -1;
    }
}