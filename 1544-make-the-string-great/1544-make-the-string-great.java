/*
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
*/
class Solution {
    public String makeGood(String s) {
        for(int i=0;i<=s.length()-2;i++)
        {
            if(Math.abs(s.charAt(i) - s.charAt(i+1))==32)
            {
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }
        }
        return s;
    }
}