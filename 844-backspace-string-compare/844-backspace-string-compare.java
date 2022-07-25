class Solution {
    public boolean backspaceCompare(String s, String t) {
        return cleanstring(s).equals(cleanstring(t));
    }
    private String cleanstring(String s)
    {
        Stack<Character> str = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(str.size()==0){
                    continue;
                }
                str.pop();
            }
            else
            {
                str.push(Character.valueOf(s.charAt(i)));
            } 
    }
        return String.valueOf(str);
    }
}