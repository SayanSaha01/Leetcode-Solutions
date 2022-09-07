class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");   //output AmanaplanacanalPanama
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=(ch.length-1);i>=0;i--)
        {
            sb.append(ch[i]);
        }
        String rev = sb.toString();
        return rev.equals(s);
    }
}