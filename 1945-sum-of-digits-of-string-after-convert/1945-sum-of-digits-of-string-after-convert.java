class Solution {
    public int getLucky(String s, int k) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i)-'a'+1);
        }
        String str = sb.toString();
        
        if(str.length()==1)
            return (str.charAt(0)-'0');
        
        int sum=0;
        while(k-->0 && str.length()>0)
        {
            sum=0;
            for(int i=0;i<str.length();i++)
            {
                sum+=str.charAt(i)-'0';
            }
            str=String.valueOf(sum);
        }
        return sum;
    }
}