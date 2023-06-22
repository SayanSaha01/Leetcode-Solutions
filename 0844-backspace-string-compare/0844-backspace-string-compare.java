class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return add(s).equals(add(t))?true:false;
    }
    public String add(String s)
    {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='#')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
            }
            else 
            {
                st.push(c);
            }
        }
        String str = "";
        while(!st.isEmpty())
        {
            str+=st.pop()+"";
        }
        System.out.print(str+" ");
        return str;
    }
    
}