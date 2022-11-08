class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<Character>();
        if(s.length()==0 || s.length()<2)
            return s;
        
        for(char c:s.toCharArray())
        {
            if(st.isEmpty())
            {
                st.push(c);
            }
            else
            {
                if(Math.abs(c-st.peek())==32)
                {
                    st.pop();
                }
                else
                {
                    st.push(c);
                }
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