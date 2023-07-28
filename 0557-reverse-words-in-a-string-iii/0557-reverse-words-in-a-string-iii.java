class Solution {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        for(String str:s.split(" "))
        {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            reverse.append(sb);
            reverse.append(" ");
        }
        return reverse.toString().trim();
    }
}