class Solution {
    public boolean checkString(String s) {
        if(!s.contains("a"))
        {
            return true;
        }
        else
        {
            for(int i=0;i<s.length()-1;i++)
            {
                if((s.charAt(i)=='b')&&(s.charAt(i+1)=='a'))
                    return false;
            }
        }
        return true;
    }
}