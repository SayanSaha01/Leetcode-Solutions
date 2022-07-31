class Solution {
    public String decodeString(String s) {
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String cur = "";
        int k = 0;
        for (char ch : s.toCharArray()) 
        {
            if (Character.isDigit(ch)) {
                k = k * 10 + ch - '0';
            } 
            else if ( ch == '[') {
                intStack.push(k);
                strStack.push(cur);
                cur = "";
                k = 0;
            } 
            else if (ch == ']') {
                String tmp = cur;
                cur = strStack.pop();
                for (k = intStack.pop(); k > 0; k--) 
                    cur+=tmp;
            } 
            else cur+=ch;
        }
        return cur.toString();
    }
}