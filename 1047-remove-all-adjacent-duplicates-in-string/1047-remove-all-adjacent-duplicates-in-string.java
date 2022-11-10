class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!st.isEmpty() && st.peek()==c)
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}