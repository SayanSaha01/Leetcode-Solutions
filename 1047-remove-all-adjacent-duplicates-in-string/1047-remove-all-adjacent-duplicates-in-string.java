class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && st.peek()==s.charAt(i))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        for(Character c:st)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}

/*    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size - 1) == c) { 
                sb.deleteCharAt(size - 1); 
            }else { 
                sb.append(c); 
            }
        }
        return sb.toString();
    }
    */