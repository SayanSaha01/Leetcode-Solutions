class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        for(String a:s.trim().split(" ")){
            if(!a.isEmpty())
                st.push(a);
        }
        //StringBuilder sb = new StringBuilder();
        String z="";
        while(!st.isEmpty())
        {
            z+=st.pop();
            z+=" ";
        }
        return z.trim();
    }
}