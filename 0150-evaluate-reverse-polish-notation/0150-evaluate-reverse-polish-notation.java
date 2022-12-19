class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(String str:tokens)
        {
            if(str.equals("+"))
            {
                int x = st.pop();
                int y = st.pop();
                st.push(x+y);
            }
            else if(str.equals("-"))
            {
                int x = -st.pop();
                int y = st.pop();
                st.push(x+y);
            }
            else if(str.equals("*"))
            {
                int x = st.pop();
                int y = st.pop();
                st.push(x*y);
            }
            else if(str.equals("/"))
            {
                int x = st.pop();
                int y = st.pop();
                st.push(y/x);
            }
            else
            {
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
}