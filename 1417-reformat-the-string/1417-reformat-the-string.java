class Solution {
    public String reformat(String s) {
        StringBuilder digit = new StringBuilder();
        StringBuilder alpha = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                digit.append(c);
            }
            else
            {
                alpha.append(c);
            }
        }
        
        if(Math.abs(digit.length()-alpha.length())>1)
            return "";
        
        int i=0;
        int j=0;
        if(digit.length()>alpha.length())
            sb.append(digit.charAt(i++));
        
        while(sb.length()<s.length())
        {
            sb.append(alpha.charAt(j++));
            if(sb.length()>=s.length())
                break;
            sb.append(digit.charAt(i++));
        }
        return sb.toString();
    }
}