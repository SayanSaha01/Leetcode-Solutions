class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String temp="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                st.push(temp);
                temp="";
            }
            else
            {
                temp+=s.charAt(i);
            }
        }
        st.push(temp);
        String s1="";
        while(st.size()!=1)
        {
            s1+=st.pop()+" ";
        }
        s1+=st.pop();
        return s1;
    }
}