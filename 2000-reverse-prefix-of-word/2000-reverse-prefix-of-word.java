class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        String sub = word.substring(0,word.indexOf(ch)+1);

        sb.append(sub);
        sb.reverse();
        sb.append(word.substring(word.indexOf(ch)+1,word.length()));
        return sb.toString();
    }
}