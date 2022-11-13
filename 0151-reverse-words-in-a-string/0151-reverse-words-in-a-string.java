class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        Stack<String> st = new Stack<>();
        for (String a : s.split(" ")) {
            if (!a.isEmpty())
                st.push(a);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}