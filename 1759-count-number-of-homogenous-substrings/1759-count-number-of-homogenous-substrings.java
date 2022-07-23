class Solution {
    public int countHomogenous(String s) {
        long count=0;
        int ans=0;
        int i=0;
        while(i<s.length())
        {
            char ch = s.charAt(i);
            while(i<s.length()&&s.charAt(i)==ch)
            {
                ans++;
                count+=ans;
                i++;
            }
            ans=0;
        }
        return (int)(count%1000000007);
    }
}